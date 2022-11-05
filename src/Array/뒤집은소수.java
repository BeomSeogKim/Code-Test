package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수 {
    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> mySolution(int number, int[] numArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int checkNum = numArray[i];
            int realNum = Integer.valueOf(new StringBuilder(String.valueOf(checkNum)).reverse().toString());
            if (isPrime(realNum)) {
                answer.add(realNum);
            }
        }

        return answer;
    }

    public ArrayList<Integer> solution(int number, int[] numArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int tmp = numArray[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        뒤집은소수 T = new 뒤집은소수();
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
