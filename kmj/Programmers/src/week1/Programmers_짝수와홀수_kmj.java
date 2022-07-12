package week1;

public class Programmers_Â¦¼ö¿ÍÈ¦¼ö_kmj {

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
		Programmers_Â¦¼ö¿ÍÈ¦¼ö_kmj p = new Programmers_Â¦¼ö¿ÍÈ¦¼ö_kmj();
		System.out.println(p.solution(10));
		}
	}
