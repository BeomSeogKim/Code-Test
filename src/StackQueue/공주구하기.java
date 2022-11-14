package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
    public int solution(int total, int number) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= total; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < number; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        공주구하기 T = new 공주구하기();
        Scanner kb = new Scanner(System.in);
        int total = kb.nextInt();
        int number = kb.nextInt();
        System.out.print(T.solution(total, number));
    }
}
