package Array;

import java.util.Scanner;

public class 봉우리 {
    public int solution(int number, int[][] numArray) {
        int answer = 0;
        for (int i = 1; i < number + 1; i++) {
            for (int j = 1; j < number + 1; j++) {
                if (numArray[i][j] > numArray[i][j - 1] && numArray[i][j] > numArray[i][j + 1] &&
                        numArray[i][j] > numArray[i - 1][j] && numArray[i][j] > numArray[i + 1][j]) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        봉우리 T = new 봉우리();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[][] numArray = new int[number + 2][number + 2];
        for (int i = 0; i < number + 2; i++) {
            for (int j = 0; j < number + 2; j++) {
                if (i == 0 || i == number + 1 || j == 0 || j == number + 1) {
                    numArray[i][j] = 0;
                } else {
                    numArray[i][j] = kb.nextInt();
                }
            }
        }
        System.out.print(T.solution(number, numArray));
    }

    // dx dy 방식 적용
//    int[] dx = {-1, 0, 1, 0};
//    int[] dy = {0, 1, 0, -1};
//    public int solution(int number, int[][] numArray) {
//        int answer = 0;
//        for (int i = 0; i < number + 1; i++) {
//            for (int j = 0; j < number + 1; j++) {
//                boolean flag = true;
//                for (int k = 0; k < 4; k++) {
//                    int nx = i + dx[k];
//                    int ny = j + dy[k];
//                    if (nx >= 0 && nx < number && ny >= 0 && ny < number && numArray[nx][ny] >= numArray[i][j]) {
//                        flag = false;
//                        break;
//                    }
//                }
//                if (flag) answer++;
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int number = kb.nextInt();
//        int[][] numArray = new int[number][number];
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                numArray[i][j] = kb.nextInt();
//            }
//        }
//        System.out.print(T.solution(number, numArray));
//    }
}
