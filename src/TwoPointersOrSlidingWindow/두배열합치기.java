package TwoPointersOrSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {
    public ArrayList<Integer> solution(int number1, int number2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < number1 && p2 < number2) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }
        while(p1<number1) answer.add(arr1[p1++]);
        while(p2<number2) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        두배열합치기 T = new 두배열합치기();
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
