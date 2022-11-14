package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    public String mySolution(String requirement, String schedule) {
        String answer = "NO";
        Queue<Character> queue = new LinkedList<>();
        // 필수 요건 기입
        for (char c : requirement.toCharArray()) {
            queue.offer(c);
        }
        // 적합 절차 체크
        for (char c : schedule.toCharArray()) {
            if (queue.isEmpty()) {
                answer = "YES";
                break;
            }
            if (c == queue.peek()) {
                queue.poll();
            }
        }
        return answer;
    }

    public String solution(String requirement, String schedule) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : requirement.toCharArray()) {
            queue.offer(c);
        }
        for (char c : schedule.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.poll() != c) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        교육과정설계 T = new 교육과정설계();
        Scanner kb = new Scanner(System.in);
        String requirement = kb.next();
        String schedule = kb.next();
        System.out.print(T.solution(requirement, schedule));
    }
}
