package selyuk.task2;

import java.util.Scanner;

public class Main {

    private static final int[] LEFT_DOWN = new int[]{-6,-3};
    private static final int[] RIGHT_DOWN = new int[]{6,0};
    private static final int[] LEFT_UP = new int[]{-4,0};
    private static final int[] RIGHT_UP = new int[]{4,5};

    public static void main(String[] args) {
        boolean isHit = isHitting(inputPoint());
        System.out.println(isHit);
    }

    private static boolean isHitting(int[] point) {
        boolean isTrue;
        if(point[1] > 0) {
            isTrue = isHittingUp(point);
        } else {
            isTrue = isHitiingDown(point);
        }
        return isTrue;
    }

    private static boolean isHitiingDown(int[] point) {
        if(point[1] >= -3) {
            return point[0] >= -6 && point[0] <= 6;
        }
        return false;
    }

    private static boolean isHittingUp(int[] point) {
        if(point[1] <= 5) {
            return point[0] >= -4 && point[0] <= 4;
        }
        return false;
    }

    private static int[] inputPoint() {
        Scanner sc = new Scanner(System.in);
        int[] point = new int[2];
        System.out.println("Enter coordinaties :");
        for(int i = 0; i < 2; i++) {
            try {
                point[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid number");
                throw new IllegalArgumentException();
            }
        }
        return point;
    }
}
