package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class 응급실 {

        public int solution(int total, int patient, int[] array) {
            int answer = 0;
            Queue<Person> queue = new LinkedList<>();
            for (int i = 0; i < total; i++) {
                queue.offer(new Person(i, array[i]));
            }
            while (!queue.isEmpty()) {
                Person tmp = queue.poll();
                for (Person x : queue) {
                    if (x.priority > tmp.priority) {
                        queue.offer(tmp);
                        tmp = null;
                        break;
                    }
                }
                if (tmp != null) {
                    answer++;
                    if (tmp.id == patient) return answer;
                }
            }
            return answer;
        }

        public static void main(String[] args) {
            응급실 T = new 응급실();
            Scanner kb = new Scanner(System.in);
            int total = kb.nextInt();
            int patient = kb.nextInt();
            int[] array = new int[total];
            for (int i = 0; i < total; i++) {
                array[i] = kb.nextInt();
            }
            System.out.print(T.solution(total, patient, array));
        }
}
