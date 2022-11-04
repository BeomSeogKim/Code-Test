package Array;

import java.util.Scanner;

public class 보이는학생 {
    public int solution(int totalNum, int[] students) {
        int answer = 0;
        int baseHeight = 0;
        for (int i = 0; i < totalNum; i++) {
            if (students[i] > baseHeight) {
                answer += 1;
                baseHeight = students[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        보이는학생 T = new 보이는학생();
        Scanner kb = new Scanner(System.in);
        int totalNum = kb.nextInt();
        int[] students = new int[totalNum];
        for (int i = 0; i < totalNum; i++) {
            students[i] = kb.nextInt();
        }
        System.out.print(T.solution(totalNum, students));

    }
}
