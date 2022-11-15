package SortingAndSearching;

import java.util.Scanner;

public class 선택정렬 {
    public int[] solution(int total, int[] array) {
        for (int i = 0; i < total - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < total; j++) {
                if (array[idx] > array[j]) idx = j;
            }
            int tmp = array[i];
            array[i] = array[idx];
            array[idx] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        선택정렬 T = new 선택정렬();
        Scanner kb = new Scanner(System.in);
        int total = kb.nextInt();
        int[] array = new int[total];
        for (int i = 0; i < total; i++) {
            array[i] = kb.nextInt();
        }
        for (int x : T.solution(total, array)) {
            System.out.print(x + " ");
        }
    }
}
