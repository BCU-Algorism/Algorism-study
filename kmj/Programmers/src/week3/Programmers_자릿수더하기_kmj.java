package week3;

public class Programmers_자릿수더하기_kmj {

		public int solution(int n) {
			int answer = 0;
			String[] arr = Integer.toString(n).split("");
	
			for(int i = 0; i < arr.length; i++) {
				answer += Integer.parseInt(arr[i]);
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		Programmers_자릿수더하기_kmj p = new Programmers_자릿수더하기_kmj();
		System.out.println(p.solution(123));

	}

}
