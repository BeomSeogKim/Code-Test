package String;

import java.util.Scanner;

public class 문자거리 {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (t == str.charAt(i)) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (t == str.charAt(i)) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자거리 T = new 문자거리();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);
        for (int x : T.solution(str, t)) {
            System.out.print(x + " ");
        }
    }
}
