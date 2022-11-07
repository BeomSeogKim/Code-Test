package TwoPointersOrSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소구하기 {
    public ArrayList<Integer> solution(int number1, int number2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < number1 && p2 < number2) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] > arr2[p2]) {
                p2++;
            } else {
                p1++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        공통원소구하기 T = new 공통원소구하기();
        Scanner kb = new Scanner(System.in);
        int number1 = kb.nextInt();
        int[] arr1 = new int[number1];
        for (int i = 0; i < number1; i++) {
            arr1[i] = kb.nextInt();
        }
        int number2 = kb.nextInt();
        int[] arr2 = new int[number2];
        for (int i = 0; i < number2; i++) {
            arr2[i] = kb.nextInt();
        }
        for (int x : T.solution(number1, number2, arr1, arr2)) {
            System.out.print(x + " ");
        }

    }
}
