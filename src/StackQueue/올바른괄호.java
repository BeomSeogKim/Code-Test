package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> cStack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == '(') {
                cStack.push(c);
            } else if (c ==')') {
                if (cStack.isEmpty()) {
                    return "NO";
                }
                cStack.pop();
            }
        }
        if (!cStack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        올바른괄호 T = new 올바른괄호();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
