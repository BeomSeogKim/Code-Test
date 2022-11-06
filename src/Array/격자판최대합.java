package Array;

import java.util.Scanner;

public class 격자판최대합 {
    public int mySolution(int number, int[][] numArray) {
        int answer = 0;
        int maxNumSave = 0;
        // 행으로 훑기
        for (int i = 0; i < number; i++) {
            int tmpRow = 0;
            for (int j = 0; j < number; j++) {
                tmpRow += numArray[i][j];
            }
            if (tmpRow > maxNumSave) maxNumSave = tmpRow;
            int tmpColumn = 0;
            for (int j = 0; j < number; j++) {
                tmpColumn += numArray[j][i];
            }
            if (tmpColumn > maxNumSave) maxNumSave = tmpColumn;
        }
        int tmpSame = 0, tmpSameReverse = 0;
        for (int i = 0; i < number; i++) {
            tmpSame += numArray[i][i];
            tmpSameReverse += numArray[i][number - i - 1];
        }
        if (tmpSame > maxNumSave) maxNumSave = tmpSame;
        if (tmpSameReverse > maxNumSave) maxNumSave = tmpSameReverse;
        answer = maxNumSave;

        return answer;
    }

    public int solution(int number, int[][] numArray) {
        int answer = 0;
        int sum1;       // 행의 합
        int sum2;       //열의 합
        for (int i = 0; i < number; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < number; j++) {
                sum1 += numArray[i][j];
                sum2 += numArray[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < number; i++) {
            sum1 += numArray[i][i];
            sum2 += numArray[i][number - 1 - i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        격자판최대합 T = new 격자판최대합();
        Scanner kb = new Scanner(System.in);
        Integer number = kb.nextInt();
        int[][] numArray = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                numArray[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(number, numArray));

    }
}
