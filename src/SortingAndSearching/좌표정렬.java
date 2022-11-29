package SortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 좌표정렬 {

    static class Point implements Comparable<Point> {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point o) {
            // 오름차순 ==> this.y - o.y 가 음수가 되도록 유지
            // 내림차순 ==> o.y - this.y 가 음수가 되도록 유지
            if (this.x ==o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }


    public static void main(String[] args) {
        좌표정렬 T = new 좌표정렬();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
