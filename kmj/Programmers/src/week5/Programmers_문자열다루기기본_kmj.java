package week5;

public class Programmers_���ڿ��ٷ��⺻_kmj {

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
		Programmers_���ڿ��ٷ��⺻_kmj p = new Programmers_���ڿ��ٷ��⺻_kmj();
		System.out.println(p.solution("123"));

	}

}
