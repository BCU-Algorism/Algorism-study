

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }


}


