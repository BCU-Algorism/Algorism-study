package week2;

public class programmers_��ձ��ϱ�_kmj {

	public double solution(int[] arr) {
		double answer = 0;
		double sum = 0; 
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		answer = sum / arr.length;
		return answer;
	}
	public static void main(String[] args) {
		programmers_��ձ��ϱ�_kmj p = new programmers_��ձ��ϱ�_kmj();
		int [] arr = {1,2,3,4};
		System.out.println(p.solution(arr));
	}
	

}
