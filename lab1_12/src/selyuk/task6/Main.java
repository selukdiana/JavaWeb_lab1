package selyuk.task6;

import java.util.Scanner;

public class Main {

    private static final int N = 5;

    public static void main(String[] args) {
        int[] arr = new int[N];
        fillArray(arr);
        showAndCreateMatrix(arr);
    }

    private static void showAndCreateMatrix(int[] arr) {
        int[][] matrix = creatematrix(arr);
        showMatrix(matrix);
    }

    private static void showMatrix(int[][] matrix) {
        for(int[] line : matrix) {
            for(int el : line) {
                System.out.printf("%2d ", el);
            }
            System.out.println();
        }
    }

    private static int[][] creatematrix(int[] arr) {
        int[][] matrix = new int[N][N];
        int z;
        for(int i = 0; i < N; i++) {
            z = i;
            for(int j = 0; j < N; j++, z++) {
                if (z == N) {
                    z = 0;
                }
                matrix[i][j] = arr[z];
            }
        }
        return matrix;
    }

    private static void fillArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
    }

}
