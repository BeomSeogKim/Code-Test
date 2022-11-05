package Array;

import java.util.Scanner;

public class 점수계산 {
    public int solution(int number, int[] numArray) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < number - 1; i++) {
            if (numArray[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        점수계산 T = new 점수계산();
        Scanner kb = new Scanner(System.in);
        Integer number = kb.nextInt();
        int[] numArray = new int[number];
        for (int i = 0; i < number; i++) {
            numArray[i] = kb.nextInt();
        }
        System.out.print(T.solution(number, numArray));
    }
}
