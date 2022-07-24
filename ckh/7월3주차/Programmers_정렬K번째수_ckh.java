import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length;i++) {
            // 1. commands[i][j]를 통해 SubString 해서 잘라내기
            int[] ints = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            //2. 정렬
            Arrays.sort(ints);
            //3. 각 커맨드면 answer에 저장
            answer[i] = ints[commands[i][2]-1];
        }

        return answer;
    }
}