package Array;

import java.util.Scanner;

/**
 * 본 문제의 경우 answer 를 바로 row 로 반환하기 위해 row를 1부터 시작
 */
public class 임시반장 {
    public int solution(int number, int[][] numArray) {
        int answer = 0, max=Integer.MIN_VALUE;
        for (int i = 1; i < number; i++) {
            int cnt = 0;
            for (int j = 1; j < number; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (numArray[i][k] == numArray[j][k]) {
                        cnt++;
                        break;      // 불필요한 반복문을 피하기 위해 break 설정.
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        임시반장 T = new 임시반장();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[][] numArray = new int[number][6];
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= 5; j++) {
                numArray[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(number, numArray));
    }
}
