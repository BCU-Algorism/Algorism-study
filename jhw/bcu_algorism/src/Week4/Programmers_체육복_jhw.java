package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_체육복_jhw {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        ArrayList<Integer> list = new ArrayList();
        for (int reserveN : reserve) {
            list.add(reserveN);
        }
        for (int i = 0; i < lost.length; i++) {
            if (list.contains(lost[i])) {
                list.remove(Integer.valueOf(lost[i]));
                lost[i] = 0;
                answer++;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (lost[i] != 0) {
                    if (list.get(j) - lost[i] == 1 ||
                            list.get(j) - lost[i] == -1) {
                        answer++;
                        list.remove(j);
                        break;
                    }
                }
            }

        }
        return answer;
    }
}
