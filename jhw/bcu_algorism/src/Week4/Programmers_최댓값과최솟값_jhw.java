package Week4;

import java.util.Arrays;

public class Programmers_최댓값과최솟값_jhw {
    public static void main(String[] args) {
        Programmers_최댓값과최솟값_jhw p = new Programmers_최댓값과최솟값_jhw();
        System.out.println("p.solution(\"-1 2 3 4\") = " + p.solution("-1 2 3 4"));

    }

    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
            System.out.println("arr[i] = " + arr[i]);
        }
        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length - 1];

        return answer;
    }
}
