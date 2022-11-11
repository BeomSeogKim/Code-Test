package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> cStack = new Stack<>();
        for (Character c : str.toCharArray()) {

            if (c == '(') {
                cStack.push(c);
            } else if (cStack.isEmpty()) answer += c;
            else if (c == ')') {
                cStack.pop();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        괄호문자제거 T = new 괄호문자제거();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
