package Week3;

import java.util.PriorityQueue;

public class Programmers_더맵게_jhw {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue();
        for(int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        while(true) {
            if(queue.size() == 1 && queue.peek() < K) {
                return -1;
            }
            int firstMin = queue.poll();
            if(firstMin < K) {
                int secondMin = queue.poll();
                int mixFoodScoville = firstMin + secondMin * 2;
                queue.offer(mixFoodScoville);
                answer++;
            }else {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
       Programmers_더맵게_jhw p = new Programmers_더맵게_jhw();
        int [] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println("p.solution() = " + p.solution(scoville,7));


    }
}
