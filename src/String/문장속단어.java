package String;

import java.util.Scanner;

public class 문장속단어 {
    public String mySolution(String str) {
        String answer = "";
        String[] array = str.split(" ");
        int basicLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > basicLength) {
                answer = array[i];
                basicLength = array[i].length();
            }
        }
        return answer;
    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }
    public String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        문장속단어 T = new 문장속단어();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution2(str));
    }
}
