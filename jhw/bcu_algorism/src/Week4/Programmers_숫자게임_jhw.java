package Week4;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_숫자게임_jhw {
    public static void main(String[] args) {
        Programmers_숫자게임_jhw p = new Programmers_숫자게임_jhw();
        int[] A = {2, 2, 2, 2};
        int[] B = {1, 1, 1, 1};
        System.out.println("p.solution() = " + p.solution(A, B));
    }

    public int solution(int[] A, int[] B) {
        int answer = 0;
        ArrayList<Integer> bList = new ArrayList<>();
        for (int bNum : B) {
            if (bList.contains(bNum)) {
                continue;
            }
            bList.add(bNum);
        }

        Collections.sort(bList);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < bList.size(); j++) {
                if (A[i] < bList.get(j)) {
                    answer++;
                    bList.remove(j);
                    break;
                }
            }
        }


        return answer;
    }
}
