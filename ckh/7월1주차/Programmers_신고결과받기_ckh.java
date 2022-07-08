import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
*  String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        *
        *
        * result:	[2,1,1,0]
*/
class Solution {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> report_set = new HashMap<String, Set<String>>();
        Map<String, Set<String>> result_set = new HashMap<String, Set<String>>();
        for (String id : id_list
        ) {
            report_set.put(id, new HashSet<>());
            result_set.put(id, new HashSet<>());
        }

        for (String list : report
        ) {
            String[] split = list.split(" ");
            String req_report = split[0];
            String rep_report = split[1];
            report_set.get(rep_report).add(req_report); // 신고당한 유저 ID
        }

        report_set.forEach((key, value) -> System.out.println("유저 : " + key + ",신고당한횟수 : " + report_set.get(key).size()));

        report_set.forEach((key, value) -> {
            if (report_set.get(key).size() >= k) { // 신고 당한 유저의 사이즈가 k 이상
                report_set.get(key).forEach((str) -> {
                    result_set.get(str).add(key); // Set에 순차적으로 접근하여 result_set에 추가
                    // ResultSet<reqId, Set<repUser>
                });

            }
        });


        for (int i = 0; i < id_list.length; i++) {
            answer[i] = (result_set.get(id_list[i])).size();
        }
        return answer;
    }
}



