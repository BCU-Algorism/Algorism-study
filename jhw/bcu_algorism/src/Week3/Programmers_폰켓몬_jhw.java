package Week3;

import java.util.HashSet;
import java.util.Set;

public class Programmers_폰켓몬_jhw {
    public static void main(String[] args) {
        Programmers_폰켓몬_jhw p = new Programmers_폰켓몬_jhw();
        int[] nums = {3, 3, 3, 2, 2, 4};
        System.out.println("p.solution() = " + p.solution(nums));
    }

    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> kinds = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            kinds.add(nums[i]);
        }

        if (kinds.size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = kinds.size();
        }
        return answer;
    }
}
