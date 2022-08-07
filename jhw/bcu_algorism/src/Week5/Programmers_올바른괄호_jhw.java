package Week5;

public class Programmers_올바른괄호_jhw {
    public static void main(String[] args) {
        Programmers_올바른괄호_jhw p = new Programmers_올바른괄호_jhw();
        System.out.println("p.solution() = " + p.solution("()))((()"));
    }

    boolean solution(String s) {
        boolean answer = true;

        int rightOpenCnt = 0;

        if (!Character.toString(s.charAt(0)).equals("(") ||
                Character.toString(s.charAt(s.length() - 1)).equals(")")) {
            System.out.println("asd");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).equals("(")) {
                rightOpenCnt++;
            } else {
                rightOpenCnt--;
            }
            if (rightOpenCnt == -1) {
                return false;
            }
        }

        if (rightOpenCnt != 0) {
            return false;
        }


        return answer;

    }


}
