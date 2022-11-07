package Array;

import java.util.Scanner;

public class 멘토링 {

    public int solution(int studentNum, int testNum, int[][] Array) {
        int answer = 0;
        for (int i = 1; i <= studentNum; i++) {
            for (int j = 1; j <= studentNum; j++) {
                int cnt = 0;
                for (int k = 0; k < testNum; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < studentNum; s++) {
                        if (Array[k][s] == i) pi = s;
                        if (Array[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == testNum) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        멘토링 T = new 멘토링();
        Scanner kb = new Scanner(System.in);
        int student = kb.nextInt();
        int testNum = kb.nextInt();
        int[][] Array = new int[testNum][student];
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < student; j++) {
                Array[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(student, testNum, Array));
    }
}
