package TwoPointersOrSlidingWindow;

import java.util.Scanner;

public class 연속된자연수의합 {
    public int mySolution(int number) {
        int answer = 0;
        int lt = 1, rt = 2;
        int sum = lt;
        while (rt < number) {
            sum += rt++;
            if (sum == number) answer++;
            while (sum > number) {
                sum -= lt++;
                if (sum == number) answer++;
            }
        }
        return answer;
    }

    public int solution(int number) {
        int answer = 0, sum = 0, lt = 0;
        int m = number / 2 + 1;   // 두가지의 수를 합하는 것이므로 반값보다 하나만 더 있으면 충분함.
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == number) answer++;
            while (sum > number) {
                sum -= arr[lt++];
                if (sum == number) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        연속된자연수의합 T = new 연속된자연수의합();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        System.out.print(T.solution(number));

    }
}
