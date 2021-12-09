package selyuk.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int N = 10;

    public static void main(String[] args) {
        int[] arr = new int[N];
        fillArray(arr);
        outAndSearchGreatestSequence(arr);
    }

    private static void outAndSearchGreatestSequence(int[] arr) {
        int k = searchGreatestSequenceAndK(arr);
        System.out.println("Result: " + k);
    }

    private static int searchGreatestSequenceAndK(int[] arr) {
        int[] arrK = new int[N - 1];
        for(int i = 0; i < N - 1; i++) {
            arrK[i] = countK(i, arr);
        }
        return searchMinimalK(arrK);
    }

    private static int countK(int indexFirstEl, int[] arr) {
        int k = indexFirstEl;
        int lastSequnceEl = arr[indexFirstEl];
        for(int i = indexFirstEl + 1; i < N; i++) {
            if(lastSequnceEl < arr[i]) {
                lastSequnceEl = arr[i];
            }else {
                k++;
            }
        }
        return k;
    }

    private static int searchMinimalK(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    private static void fillArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
    }

}
