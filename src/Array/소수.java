package Array;

import java.util.Scanner;

public class 소수 {
    public int solution(int num) {
        int answer = 0;
        for (int i = 2; i < num; i++) {
            if (i % 2 != 0 || i % 3 != 0) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수 T = new 소수();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.print(T.solution(num));
    }
}
