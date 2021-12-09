package selyuk.task1;

public class Main {

    private static final int X = 0;
    private static final int Y = 0;

    public static void main(String[] args) {
        double numerator = calculateNumerator();
        double denaminator = calculateDenamimator();
        double res = numerator/denaminator + X;
        System.out.println("Result: " + res);
    }

    private static double calculateNumerator() {
        return 1 + Math.pow(Math.sin(X + Y), 2);
    }

    private static double calculateDenamimator() {
        return 2 + Math.abs(X*(1 - 2/(1+Math.pow(X,2)*Math.pow(Y,2))));
    }

}
