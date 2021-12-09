package training.task_9;

import java.util.ArrayList;
import java.util.List;

public class Bucket {

    List<Ball> balls = new ArrayList<>();

    public List<Ball> getBalls() {
        return balls;
    }

    public void putBall(Ball ball) {
        balls.add(ball);
    }

}
