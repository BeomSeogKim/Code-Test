package HashMapAndTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액의종류 {
    public ArrayList<Integer> solution(int days, int terms, int[] sales) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // 1차적으로 HashMap 구성
        for(int i = 0; i < terms; i++) {
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);
        }
        answer.add(map.size());
        for(int i = terms; i < days; i++) {
            // 기존에 있던 것 제거
            map.put(sales[i-terms], map.get(sales[i-terms]) - 1);
            if(map.get(sales[i-terms]) == 0) map.remove(sales[i-terms]);
            // 새로운 값 추가
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);

            answer.add(map.size());
        }

        return answer;
    }


    public static void main(String[] args){
        매출액의종류 T = new 매출액의종류();
        Scanner kb = new Scanner(System.in);
        int days = kb.nextInt();
        int terms = kb.nextInt();
        int[] sales = new int[days];
        for(int i = 0; i < days; i++) {
            sales[i] = kb.nextInt();
        }
        for(int x : T.solution(days, terms, sales)) {
            System.out.print(x + " ");
        }
    }
}
