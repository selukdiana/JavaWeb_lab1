package training.task_9;

import java.util.List;

public class Main {

    private static Bucket bucket = new Bucket();

    public static void main(String[] args) {

        bucket.putBall(new Ball("blue", 1000.6));
        bucket.putBall(new Ball("red", 800));
        bucket.putBall(new Ball("white", 780.3));
        bucket.putBall(new Ball("blue", 1260));
        bucket.putBall(new Ball("black", 1444.3));
        bucket.putBall(new Ball("blue", 999));

        outQuintityBlueBalls();
        outTotalWeight();

    }

    private static void outTotalWeight() {
        double weight = countTotalWeight();
        System.out.printf("\n Total weight: %.3f", weight);
    }

    private static void outQuintityBlueBalls() {
        int count = countBlueBalls();
        System.out.printf("\n Count blue balls: %d", count);
    }

    private static double countTotalWeight() {
        double weight = 0;
        List<Ball> balls = bucket.getBalls();
        for(Ball ball: balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    private static int countBlueBalls() {
        int count = 0;
        List<Ball> balls = bucket.getBalls();
        for(Ball ball: balls) {
            if("blue".equals(ball.getColor())) {
                count++;
            }
        }
        return count;
    }
}
