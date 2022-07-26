package week4;

public class Programmers_수박수박수박수박수박수_kmj {

	public String solution(int n) {
		String answer = "";
		for(int i = 1; i <= n; i++) {
				if(i % 2 == 0) {
					answer += "박";
				}
				else {
					answer += "수";
				}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Programmers_수박수박수박수박수박수_kmj p = new Programmers_수박수박수박수박수박수_kmj();
		System.out.println(p.solution(3));

	}

}
