package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> number = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                // char'0' 는 0에 비해 48이 더 크다!
                number.push(c - 48);
            } else {
                int number2 = number.pop();
                int number1 = number.pop();
                if (c == '+') number.push(number1 + number2);
                else if(c == '-') number.push(number1 - number2);
                else if (c == '/') number.push(number1 / number2);
                else if(c == '*') number.push(number1 * number2);
            }
        }
        answer = number.peek();
        return answer;
    }

    public static void main(String[] args) {
        후위식연산 T = new 후위식연산();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
