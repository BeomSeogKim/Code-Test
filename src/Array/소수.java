package Array;

import java.util.Scanner;

public class 소수 {
    public int solution(int num) {
        int answer = 0 ;
        int[] ch = new int[num + 1];
        for (int i = 2; i < num; i++) {
            if (ch[i] == 0) {
                answer += 1;
                for (int j = i; j <= num; j += i) {
                    ch[j] = 1;
                }
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
