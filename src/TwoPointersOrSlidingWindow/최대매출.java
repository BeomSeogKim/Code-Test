package TwoPointersOrSlidingWindow;

import java.util.Scanner;

public class 최대매출 {
    public int solution(int totalNum, int limitNum, int[] saleArray) {
        int answer;
        int sum = 0;
        for (int i = 0; i < limitNum; i++) {
            sum += saleArray[i];
        }
        answer = sum;
        for (int i = limitNum; i < totalNum; i++) {
            sum += saleArray[i] - saleArray[i - limitNum];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        최대매출 T = new 최대매출();
        Scanner kb = new Scanner(System.in);
        int totalNum = kb.nextInt();
        int limitNum = kb.nextInt();
        int[] saleArray = new int[totalNum];
        for (int i = 0; i < totalNum; i++) {
            saleArray[i] = kb.nextInt();
        }
        System.out.print(T.solution(totalNum, limitNum, saleArray));
    }
}
