package SortingAndSearching;

import java.util.Scanner;

public class LRU {
    public int[] solution(int size, int number, int[] numArray) {
        int[] cache = new int[size];
        for (int x : numArray) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        LRU T = new  LRU();
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int number = kb.nextInt();
        int[] numArray = new int[number];
        for (int i = 0; i < number; i++) {
            numArray[i] = kb.nextInt();
        }
        for (int x : T.solution(size, number, numArray)) {
            System.out.print(x + " ");
        }
    }
}
