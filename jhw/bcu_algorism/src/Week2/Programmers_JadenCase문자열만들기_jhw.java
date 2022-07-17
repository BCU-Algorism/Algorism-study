package Week2;

public class Programmers_JadenCase문자열만들기_jhw {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        split[0] = split[0].toUpperCase();
        answer = split[0];
        for(int i = 1; i < split.length; i++) {
            if(split[i-1].equals(" ") && !split[i].equals(" ")) {
                split[i] = split[i].toUpperCase();
            }else {
                split[i] = split[i].toLowerCase();
            }
            answer += split[i];
        }
        return answer;
    }

}
