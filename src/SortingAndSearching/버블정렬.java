package SortingAndSearching;

import java.util.Scanner;

public class 버블정렬 {
    public int[] solution(int number, int[] arr) {
        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        버블정렬 T = new 버블정렬();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(number, arr)) {
            System.out.print(x + " ");
        }
    }
}
