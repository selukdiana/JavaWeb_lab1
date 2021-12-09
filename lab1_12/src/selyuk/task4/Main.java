package selyuk.task4;

import java.util.Scanner;

public class Main {

    private static final int N = 6;

    public static void main(String[] args) {
        int[] arr = new int[N];
        fillArray(arr);
        outSimpleNumbersIndex(arr);
    }

    private static void outSimpleNumbersIndex(int[] arr) {
        System.out.println("Indexes: ");
        for (int i = 0; i < N; i++) {
            if (isSimpleNum(arr[i])) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static boolean isSimpleNum(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void fillArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
    }

}
