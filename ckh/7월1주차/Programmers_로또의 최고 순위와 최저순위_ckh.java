
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int zeroCnt = 0;
        int score = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j])
                    score++;
            }

        }
        answer[0] = getResult(score+zeroCnt);
        answer[1] = getResult(score);


        return answer;
    }

    private static int getResult(int score) {
        switch (score) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;

        }

    }
}

