package Week2;

import java.util.HashMap;
import java.util.Map;

public class Programmers_영어끝말잇기_jhw {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 1;
        int human = 1;
        Map<String, Integer> word = new HashMap<>();
        while (true) {

            boolean isDuplicate = true;

            for (int i = 0; i < words.length; i++) {

                if (human > n) {
                    human = 1;
                    cnt++;
                }

                if (word.get(words[i]) == null) {
                    word.put(words[i], 1);
                } else if (word.get(words[i]) != null) {
                    isDuplicate = false;
                    break;
                }
                if (i > 0) {
                    if (!words[i - 1].endsWith(Character.toString(words[i].charAt(0)))) {
                        isDuplicate = false;
                        break;
                    }
                }
                human++;
            }
            if (isDuplicate) {
                answer[0] = 0;
                answer[1] = 0;
                break;
            } else {
                answer[0] = human;
                answer[1] = cnt;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_영어끝말잇기_jhw p = new Programmers_영어끝말잇기_jhw();
        int [] fess = {180, 5000, 10, 600};
        String [] records = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println("p = " + p.solution(2,records));
    }
}
