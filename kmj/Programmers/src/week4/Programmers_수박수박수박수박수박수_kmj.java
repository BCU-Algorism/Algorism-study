package week4;

public class Programmers_���ڼ��ڼ��ڼ��ڼ��ڼ�_kmj {

	public String solution(int n) {
		String answer = "";
		for(int i = 1; i <= n; i++) {
				if(i % 2 == 0) {
					answer += "��";
				}
				else {
					answer += "��";
				}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Programmers_���ڼ��ڼ��ڼ��ڼ��ڼ�_kmj p = new Programmers_���ڼ��ڼ��ڼ��ڼ��ڼ�_kmj();
		System.out.println(p.solution(3));

	}

}
