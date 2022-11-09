package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public char solution(int number, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        for (char key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        학급회장 T = new 학급회장();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(number, str));

    }
}
