package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 가위바위보 {
    public ArrayList<String> solution(int number, int[] A, int[] B) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (A[i] == 1) {
                if (B[i] == 1) {
                    answer.add("D");
                } else if (B[i] == 2) {
                    answer.add("B");
                } else {
                    answer.add("A");
                }
            } else if (A[i] == 2) {
                if (B[i] == 1) {
                    answer.add("A");
                } else if (B[i] == 2) {
                    answer.add("D");
                } else {
                    answer.add("B");
                }
            } else {
                if (B[i] == 1) {
                    answer.add("B");
                } else if (B[i] == 2) {
                    answer.add("A");
                } else {
                    answer.add("D");
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        가위바위보 T = new 가위바위보();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] A = new int[number];
        int[] B = new int[number];
        for (int i = 0; i < number; i++) {
            A[i] = kb.nextInt();
        }
        for (int i = 0; i < number; i++) {
            B[i] = kb.nextInt();
        }
        for (String result : T.solution(number, A, B)) {
            System.out.println(result);
        }
    }
}
