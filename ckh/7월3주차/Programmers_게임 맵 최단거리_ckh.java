import java.io.*;
import java.util.*;

class Solution {
    //상하좌우
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int[][] maps;


    public int solution(int[][] maps) {
        int answer = 0;
        this.maps = maps;
        // 5x5 방문 맵
        int[][] visitedMap = new int[maps.length][maps[0].length];

   /*     for (int i = 0; i < visitedMap.length; i++) {
            for (int j = 0; j < visitedMap[0].length; j++) {
                visitedMap[i][j] = false;
            }
        }*/
        bfs(0, 0, visitedMap);

        answer = maps[maps.length - 1][maps[0].length - 1];

        if (answer == 0 || answer == 1)
            return -1;

        return answer;

    }

    public void bfs(int now_X, int now_Y, int[][] visitedMap) {
        Queue<int[]> queue = new LinkedList<>();
        visitedMap[now_X][now_Y] = 1; // 방문처리

        queue.offer(new int[]{now_X, now_Y});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int poll_x = poll[0];
            int poll_y = poll[1];

            for (int i = 0; i < 4; i++) {
                int next_x = poll_x + dx[i];
                int next_y = poll_y + dy[i];

                if (next_x < 0 || next_y < 0 || next_x > maps.length - 1 || next_y > maps[0].length - 1) // -1 되거나
                    continue;
                if (visitedMap[next_x][next_y] == 1 || maps[next_x][next_y] == 0)
                    continue;

                visitedMap[next_x][next_y] = 1;
                maps[next_x][next_y] = maps[poll_x][poll_y] + 1;
                queue.offer(new int[]{next_x, next_y});
            }

        }
        //상하좌우 움직이기

    }


}