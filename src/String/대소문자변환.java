package String;

import java.util.Scanner;

public class 대소문자변환 {
    public String solution(String str) {
        String answer ="";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }
//        answer = charArray.toString();
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            // 대문자 확인 (대문자는 65~90 // 소문자는 97 ~ 122)
            if (c >= 65 && c <= 90) {
                answer +=(char) (c + 32);
            } else {
                answer +=(char) (c - 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        대소문자변환 T = new 대소문자변환();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution2(str));
    }
}
