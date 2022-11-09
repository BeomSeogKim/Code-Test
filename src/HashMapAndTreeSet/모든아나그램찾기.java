package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {
    public int solution(String str1, String str2) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // 검증용 Map Setting
        for(char c : str2.toCharArray()) {
            map2.put(c,map2.getOrDefault(c, 0) + 1);
        }

        // 1차 Map Setting
        for(int i = 0; i < str2.length() - 1; i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        int lt = 0, cnt = 0;
        // 2차 윈도우
        for(int rt = str2.length() - 1; rt < str1.length(); rt++) {
            map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0) + 1);
            if(map.equals(map2)) answer ++;
            map.put(str1.charAt(lt), map.get(str1.charAt(lt)) - 1);
            if(map.get(str1.charAt(lt)) == 0) map.remove(str1.charAt(lt));
            lt ++;
        }


        return answer;
    }


    public static void main(String[] args){
        모든아나그램찾기 T = new 모든아나그램찾기();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.print(T.solution(str1, str2));
    }
}

