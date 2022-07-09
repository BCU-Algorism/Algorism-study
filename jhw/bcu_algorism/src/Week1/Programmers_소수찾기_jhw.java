package Week1;

public class Programmers_소수찾기_jhw {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            boolean isMinority = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        isMinority = false;
                        break;
                    }

            }
            if(isMinority) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_소수찾기_jhw p = new Programmers_소수찾기_jhw();
        System.out.println("p = " + p.solution(10));
    }
}
