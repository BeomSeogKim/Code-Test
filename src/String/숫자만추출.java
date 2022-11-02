package String;

import java.util.Scanner;

public class 숫자만추출 {
    public int mySolution(String str) {
        int answer = 0;
        str = str.toLowerCase().replaceAll("[a-z]", "");
        if (str.charAt(0) == '0') str = str.substring(1);
        answer = Integer.parseInt(str);
        return answer;
    }

    /**
     * character 의 경우 48 ~ 57 => 문자 '0' ~ '9'
     * answer = answer * 10 + (x-48)
     */
    public int solution(String str) {
        int answer = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 48 && ch < 57) {
                answer = answer * 10 + (ch - 48);
            }
        }
        return answer;
    }
    public int solution2(String str) {
        String answer = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                answer += ch;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        숫자만추출 T = new 숫자만추출();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution2(str));
    }
}
