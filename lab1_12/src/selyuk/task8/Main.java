package selyuk.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final int N = 5;
    private static final int M = 3;
    private static int[] firstArr = new int[N];
    private static ArrayList<Integer> secondArr = new ArrayList<>();
    private static Map<Integer, Boolean> indexes = new HashMap<>();

    public static void main(String[] args) {
        fillArrays();
        insertingElements();
        showNewIndexes();
    }

    private static void showNewIndexes() {
        for (int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static void insertingElements() {
        int index = 0;
        for(int i = 0; i < N; i++) {
            if(!secondArr.isEmpty()) {
                if(firstArr[i] < secondArr.get(0)) {
                    indexes.put(index, false);
                } else {
                    indexes.put(index, true);
                    secondArr.remove(0);
                    i--;
                }
                index++;
            }else {
                return;
            }
        }
        addLastIndexes(index);
    }

    private static void addLastIndexes(int index) {
        while(!secondArr.isEmpty()) {
            indexes.put(index++, true);
            secondArr.remove(0);
        }
    }


    private static void fillArrays() {
        System.out.println("Enter elements of the first increasing sequence: ");
        fillArray(firstArr);
        System.out.println("Enter elements of the second increasing sequence: ");
        fillArray();
    }

    private static void fillArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private static void fillArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < M; i++) {
            secondArr.add(sc.nextInt());
        }
    }

}
