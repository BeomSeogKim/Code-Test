package TwoPointersOrSlidingWindow;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public int mySolution(int arrayNumber, int changeNumber, int[] array) {
        int answer = 0, maxLength = 0, changeCount = 0;
        int lt = 0;
        for (int rt = 0; rt < arrayNumber; rt++) {
            answer = Math.max(answer, maxLength);
            if (array[rt] == 0) {
                changeCount++;
            }
            while (changeCount > changeNumber) {
                if (array[lt] == 0) {
                    changeCount--;
                }
                lt++;
            }
            maxLength = rt - lt + 1;
        }
        return answer;
    }

    public int solution(int arrayNumber, int changeNumber, int[] array) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < arrayNumber; rt++) {
            if (array[rt] == 0) {
                cnt++;
            }
            while (cnt > changeNumber) {
                if (array[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        최대길이연속부분수열 T = new 최대길이연속부분수열();
        Scanner kb = new Scanner(System.in);
        int arrayNumber = kb.nextInt();
        int changeNumber = kb.nextInt();
        int[] array = new int[arrayNumber];
        for (int i = 0; i < arrayNumber; i++) {
            array[i] = kb.nextInt();
        }
        System.out.print(T.solution(arrayNumber, changeNumber, array));
    }
}
