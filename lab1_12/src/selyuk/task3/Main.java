package selyuk.task3;

public class Main {

    private static final double A = 1;
    private static final double B = 2;
    private static final double H = 1;

    public static void main(String[] args) {
        System.out.println("\tx\t\t|\tF(x)\t\t\n|_______________________|");
        calculateAndOutParam();
        System.out.println("|_______________________|");
    }

    private static void calculateAndOutParam() {
        for (double x = A; x <= B; x += H) {
            System.out.printf("|%.3f\t\t|%.3f\t\t|\n", x, Math.tan(x));
        }
    }

}
