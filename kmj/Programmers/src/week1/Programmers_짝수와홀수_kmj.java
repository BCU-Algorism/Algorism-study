package week1;

public class Programmers_¦����Ȧ��_kmj {

	public String solution(int num) {
				String answer = "";
				if(num%2 == 0) {
					answer = "Even";
				} else {
					answer = "Odd";
				}
				return answer;
			}
	public static void main(String[] args) {
		Programmers_¦����Ȧ��_kmj p = new Programmers_¦����Ȧ��_kmj();
		System.out.println(p.solution(10));
		}
	}
