package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램_Hash {
    public String mySoultion(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // 첫번째 단어 HashMap에 넣기
        for(Character c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        // 두번째 단어 HashMap에 넣기
        for(Character c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        for(Character c : map1.keySet()) {
            if(map1.get(c) != map2.get(c)) return "NO";
        }
        return answer;
    }

    /**
     * map을 하나만 사용하여 str1는 모조리 더하고 str2 는 모조리 빼주는 알고리즘
     */
    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }


    public static void main(String[] args){
        아나그램_Hash T = new 아나그램_Hash();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String str2 = kb.next();
        System.out.print(T.solution(str, str2));
    }
}
