package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public ArrayList<Integer> solution(int number, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        for (int i = 0; i < number; i++) {
            if (arr[i] != sortedArr[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        장난꾸러기 T = new 장난꾸러기();
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
