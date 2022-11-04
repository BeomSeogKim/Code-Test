package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 피보나치수열 {
    public ArrayList<Integer> solution(int number) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        for (int i = 2; i < number; i++) {
            int sumOfPrecedent = answer.get(i - 2) + answer.get(i - 1);
            answer.add(sumOfPrecedent);
        }
        return answer;
    }

    public static void main(String[] args) {
        피보나치수열 T = new 피보나치수열();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        for (int result : T.solution(number)) {
            System.out.print(result + " ");
        }
    }
}
