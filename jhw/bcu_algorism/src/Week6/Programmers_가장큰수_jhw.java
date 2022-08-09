package Week6;

import java.util.ArrayList;

public class Programmers_가장큰수_jhw {
    public static void main(String[] args) {
        Programmers_가장큰수_jhw p = new Programmers_가장큰수_jhw();
        int[] an = {1, 3, 2, 4, 2};
        System.out.println("p = " + p.solution(an));
    }

    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        int[] firstPerson = {1, 2, 3, 4, 5};
        int[] secondPerson = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPerson = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int firstScore = 0;
        int secondScore = 0;
        int thirdScore = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstPerson[i % firstPerson.length]) {
                firstScore++;
            }
            if (answers[i] == secondPerson[i % secondPerson.length]) {
                secondScore++;
            }
            if (answers[i] == thirdPerson[i % thirdPerson.length]) {
                thirdScore++;
            }
        }

        System.out.println(firstScore);
        System.out.println(secondScore);
        System.out.println(thirdScore);
        int max = Math.max(firstScore, Math.max(secondScore, thirdScore));
        if (max == firstScore) {
            list.add(1);
        }
        if (max == secondScore) {
            list.add(2);
        }
        if (max == thirdScore) {
            list.add(3);
        }
        return list;
    }
}
