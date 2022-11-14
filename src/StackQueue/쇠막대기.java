package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') stack.push(c);

            if (c == ')') {
                //레이저 일 경우
                if (str.charAt(i - 1) == '(') {
                    stack.pop();
                    answer += stack.size();
                }
                //막대기 일 경우
                if (str.charAt(i - 1) == ')') {
                    stack.pop();
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        쇠막대기 T = new 쇠막대기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
