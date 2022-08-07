package Week5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programmers_두개뽑아서더하기_jhw {
    public static void main(String[] args) {
        Programmers_두개뽑아서더하기_jhw p = new Programmers_두개뽑아서더하기_jhw();


    }

    public int[] solution(int[] numbers) {
        int[] answer = {};
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            answer[i] = iterator.next();
            i++;
        }
        return answer;
    }
}
