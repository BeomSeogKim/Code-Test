package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 등수구하기 {
    public ArrayList<Integer> solution(int number, int[] numArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int cnt = 1;
            for (int j = 0; j < number; j++) {
                if (numArray[i] < numArray[j]) {
                    cnt += 1;
                }
            }
            answer.add(cnt);
        }


        return answer;
    }

    public static void main(String[] args) {
        등수구하기 T = new 등수구하기();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] numArray = new int[number];
        for (int i = 0; i < number; i++) {
            numArray[i] = kb.nextInt();
        }
        for (int x : T.solution(number, numArray)) {
            System.out.print(x + " ");

        }

    }
}
