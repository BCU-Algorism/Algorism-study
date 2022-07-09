package Week1;

public class Programmers_약수의합_jhw {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
