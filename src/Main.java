import java.util.*;

class Main {
    public int[] solution(int number, int[] arr) {
        for (int i = 1; i < number; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(number, arr)) {
            System.out.print(x + " ");
        }
    }
}