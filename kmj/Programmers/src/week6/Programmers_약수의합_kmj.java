package week6;

public class Programmers_약수의합_kmj {

	public int solution(int n) {
		int answer = 0;
		for(int i=1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Programmers_약수의합_kmj p = new Programmers_약수의합_kmj();
		System.out.println(p.solution(5));

	}

}
