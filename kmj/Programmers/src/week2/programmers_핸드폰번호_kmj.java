package week2;

public class programmers_�ڵ�����ȣ_kmj {

	public String solution(String phone_number) {
		String answer = "";
		String[] split = phone_number.split("");
		for(int i = 0; i < split.length; i++) {
			if(i < split.length-4) {
				answer += "*";
			}else {
				answer += split[i];
			}
		} 
		
		return answer;
	}
	
	public static void main(String[] args) {
		programmers_�ڵ�����ȣ_kmj p = new programmers_�ڵ�����ȣ_kmj();
		String phone_number = "01031200011";
		System.out.print(p.solution(phone_number));
		

	}

}
