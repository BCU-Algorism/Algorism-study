package week3;

public class Programmers_�ڸ������ϱ�_kmj {

		public int solution(int n) {
			int answer = 0;
			String[] arr = Integer.toString(n).split("");
	
			for(int i = 0; i < arr.length; i++) {
				answer += Integer.parseInt(arr[i]);
			}
			
			return answer;
		}
	
	public static void main(String[] args) {
		Programmers_�ڸ������ϱ�_kmj p = new Programmers_�ڸ������ϱ�_kmj();
		System.out.println(p.solution(123));

	}

}
