package week2;

public class Programmers_Æò±Õ±¸ÇÏ±â_kmj {

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
		Programmers_Æò±Õ±¸ÇÏ±â_kmj p = new Programmers_Æò±Õ±¸ÇÏ±â_kmj();
		int [] arr = {1,2,3,4};
		System.out.println(p.solution(arr));
	}
	

}