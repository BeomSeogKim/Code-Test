package SortingAndSearching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 중복확인 {

    // 정렬
    public String solution(int number, int[] numArray) {
        String answer = "U";
        Arrays.sort(numArray);
        for (int i = 0; i < number - 1; i++) {
            if (numArray[i] == numArray[i+1]) return "D";
        }
        return answer;
    }

    // HashMap
    public String hashMap(int number, int[] numArray) {
        String answer = "U";
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x : numArray) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
            if (hashMap.get(x) == 2) {
                return "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        중복확인 T = new 중복확인();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] numArray = new int[number];
        for (int i = 0; i < number; i++) {
            numArray[i] = kb.nextInt();
        }
        System.out.print(T.hashMap(number, numArray));
    }
}
