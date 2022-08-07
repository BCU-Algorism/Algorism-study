package week5;

public class Programmers_문자열다루기기본_kmj {

	public boolean solution(String s) {
		boolean answer = true;
		if(s.length() == 4 || s.length() == 6) {
			if(s.matches(".*[a-zA-Z].*")) {
				answer = false;
			}else {
				answer = true;
			}
		}else {
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Programmers_문자열다루기기본_kmj p = new Programmers_문자열다루기기본_kmj();
		System.out.println(p.solution("123"));

	}

}
