package week6;

public class Programmers_�������_kmj {

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
		Programmers_�������_kmj p = new Programmers_�������_kmj();
		System.out.println(p.solution(5));

	}

}
