package TwoPointersOrSlidingWindow;

import java.util.Scanner;

public class 연속부분수열 {
    public int mySolution(int total, int sum, int[] arr) {
        int answer = 0;
        int p = 0;
        int addResult = 0;
        int i = 0;
        while (p < total) {
            addResult += arr[p + i];
            i++;
            if (addResult == sum) {
                addResult = 0;
                answer++;
                i = 0;
                p++;
            } else if (addResult > sum) {
                i = 0;
                addResult = 0;
                p++;
            }
            if (p + i >= total) {
                p++;
                i = 0;
                addResult = 0;
            }

        }
        return answer;
    }

    public int solution(int total, int sum, int[] arr) {
        int answer = 0, addResult = 0, lt = 0;
        for (int rt = 0; rt < total; rt++) {
            addResult += arr[rt];
            if (addResult == sum) answer++;
            while (addResult >= sum) {
                addResult -= arr[lt++];
                if (addResult == sum) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        연속부분수열 T = new 연속부분수열();
        Scanner kb = new Scanner(System.in);
        int total = kb.nextInt();
        int sum = kb.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(total, sum, arr));
    }
}
