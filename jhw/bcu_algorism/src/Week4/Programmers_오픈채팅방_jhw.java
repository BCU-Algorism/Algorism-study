package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Programmers_오픈채팅방_jhw {
    public static void main(String[] args) {
        Programmers_오픈채팅방_jhw p = new Programmers_오픈채팅방_jhw();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println("p.solution() = " + p.solution(record));
    }

    public String[] solution(String[] record) {
        String[] answer;
        ArrayList<String> answerList = new ArrayList<>();
        Map<String, String> recordKeyValue = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] recordSplit = record[i].split(" ");
            if (recordSplit[0].equals("Change")) {
                recordKeyValue.put(recordSplit[1], recordSplit[2]);
                continue;
            }
            if (recordSplit[0].equals("Enter")) {
                answerList.add(recordSplit[1] + "님이 들어왔습니다.");
                recordKeyValue.put(recordSplit[1], recordSplit[2]);
            } else if (recordSplit[0].equals("Leave")) {
                answerList.add(recordSplit[1] + "님이 나갔습니다.");
            }

        }
        answer = new String[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            String[] split = answerList.get(i).split("님이");
            answer[i] = answerList.get(i).replace(split[0], recordKeyValue.get(split[0]));
        }

        return answer;
    }
}
