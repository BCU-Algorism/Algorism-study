import java.util.*;
import java.util.stream.Collectors;


class Solution {

    public static int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] resultArray = {0, 0, 0};
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (pattern1[i % pattern1.length] == answers[i])
                resultArray[0]++;
            if (pattern2[i % pattern2.length] == answers[i])
                resultArray[1]++;
            if (pattern3[i % pattern3.length] == answers[i])
                resultArray[2]++;
        }

        List<Integer> resultList = Arrays.stream(resultArray).boxed().collect(Collectors.toList());
        int maxValue = Collections.max(resultList);

        for (int i = 0; i < 3; i++) {
            if (maxValue == resultList.get(i))
                answerList.add(i + 1);
        }


        return answerList.stream().mapToInt(Integer::intValue).toArray();

    }
}

