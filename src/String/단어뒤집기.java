package String;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
    public ArrayList<String> solution(int num, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            /**
             * String :  변하게 되면 새로운 객체를 생성함.
             * StringBuilder : 문자를 변경을 하여도 객체가 추가적으로 생성되지 않음. ->메모리가 무거워 지지 않음.
             */
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solution2(int num, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    public static void main(String[] args) {
        단어뒤집기 T = new 단어뒤집기();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution2(num, str)) {
            System.out.println(x);
        }
    }
}
