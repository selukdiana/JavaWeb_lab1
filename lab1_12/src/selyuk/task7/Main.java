package selyuk.task7;

import java.util.Scanner;

public class Main {

    private static final int N = 5;

    public static void main(String[] args) {
        int[] arr = new int[N];
        fillArray(arr);
        outSortedArray(arr);
    }

    private static void outSortedArray(int[] arr) {
        sortShella(arr);
        showArray(arr);
    }

    private static void showArray(int[] sortedArr) {
        for(int el : sortedArr) {
            System.out.printf("%d ", el);
        }
    }

    private static void sortShella(int[] arr) {
        for(int i = 0; i < N - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                shuffle(arr, i);
                i = ((i == 0) ? (i -= 1) : (i -= 2));
            }
        }
    }

    private static void shuffle(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    private static void fillArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
    }

}
