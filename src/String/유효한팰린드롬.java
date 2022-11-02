package String;

import java.util.Scanner;

public class 유효한팰린드롬 {
    public String solution(String str) {
        String answer = "NO";
        // ^ : 부정
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (reverseStr.equals(str)) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        유효한팰린드롬 T = new 유효한팰린드롬();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
