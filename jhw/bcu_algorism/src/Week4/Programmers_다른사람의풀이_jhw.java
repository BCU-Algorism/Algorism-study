package Week4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers_다른사람의풀이_jhw {

    public static void main(String[] args) {
        Programmers_다른사람의풀이_jhw p = new Programmers_다른사람의풀이_jhw();
        int[] pro = {93, 30, 55};
        int[] spe = {1, 30, 5};
        System.out.println("p.solution() = " + p.solution(pro, spe));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int progresse : progresses) {
            queue.add(progresse);
        }
        int progressesDay = 0;
        int resultIndex = 0;
        for (int i = 0; i < speeds.length; i++) {
            int res = 100 - queue.poll();
            int progressesTempDay = 0;
            if (res % speeds[i] != 0) {
                progressesTempDay += 1;
            }
            progressesTempDay += res / speeds[i];

            if (progressesTempDay > progressesDay) {
                progressesDay = progressesTempDay;
                result.add(1);
                if (i != 0) {
                    resultIndex++;
                }
            } else {
                Integer cnt = result.get(resultIndex);
                cnt++;
                result.remove(resultIndex);
                result.add(resultIndex, cnt);

            }
        }
        answer = new int[result.size()];
        int k = 0;
        for (Integer integer : result) {
            answer[k] = integer;
            k++;
        }


        return answer;
    }


}
