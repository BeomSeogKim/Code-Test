package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
    public int solution(int[][] Array, int[] todoArray) {
        int answer = 0;
        Stack<Integer> game = new Stack<>();
        for (int pos : todoArray) {
            for (int i = 0; i < Array.length; i++) {
                if (Array[i][pos - 1] != 0) {
                    int tmp = Array[i][pos - 1];
                    Array[i][pos - 1] = 0;
                    if (!game.isEmpty() && game.peek() == tmp) {
                        answer += 2;
                        game.pop();
                    } else {
                        game.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        크레인인형뽑기 T = new 크레인인형뽑기();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[][] Array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                Array[i][j] = kb.nextInt();
            }
        }
        int totalNum = kb.nextInt();
        int[] todoArray = new int[totalNum];
        for (int i = 0; i < totalNum; i++) {
            todoArray[i] = kb.nextInt();
        }
        System.out.print(T.solution(Array, todoArray));
    }
}
