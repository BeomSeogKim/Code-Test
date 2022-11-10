package programmers;

import java.util.*;

public class 체육복 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashSet<Integer> lostPeople = new HashSet<>();
        HashSet<Integer> reservePeople = new HashSet<>();

        for (int i = 0; i < reserve.length; i++) {
            reservePeople.add(reserve[i]);
        }

        for (int i = 0; i < lost.length; i++) {
            if (reservePeople.contains(lost[i])) {
                reservePeople.remove(lost[i]);
            } else {
                lostPeople.add(lost[i]);
            }
        }
        for (int i : reservePeople) {
            if (lostPeople.contains(i - 1)) {
                lostPeople.remove(i - 1);
            } else if (lostPeople.contains(i + 1)) {
                lostPeople.remove(i + 1);
            }
        }
        answer = n - lostPeople.size();
        return answer;
    }
}
