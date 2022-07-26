package week4;

public class Programmers_두정수사이의합_kmj {

	public long solution(int n, int b) {
		long answer = 0;
		int max = 0;
		int min = 0;
		
		if(n < b) {
			max = b;
			min = n;
		}
		else {
			max = n;
			min = b;
		}
		for(int i = min; i <= max; i++) {
			answer += i;
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Programmers_두정수사이의합_kmj p = new Programmers_두정수사이의합_kmj();
		System.out.println(p.solution(3,11));

	}

}
