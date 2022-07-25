package week3;

public class Programmers_문자열을정수로바꾸기_kmj {

	public int solution(String s) {
		int answer = 0;
		int str = Integer.parseInt(s);
		answer += str;
		return answer;
		
	}
	
	public static void main(String[] args) {
		Programmers_문자열을정수로바꾸기_kmj p = new Programmers_문자열을정수로바꾸기_kmj();
		System.out.println(p.solution("-1234"));

	}

}
