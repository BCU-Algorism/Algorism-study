package Week6;

public class Programmers_최소직사각형_jhw {

    public int solution(int[][] sizes) {
        int maxHeight = 0;
        int maxWeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            int temp = 0;
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (sizes[i][0] > maxHeight) {
                maxHeight = sizes[i][0];
            }
            if (sizes[i][1] > maxWeight) {
                maxWeight = sizes[i][1];
            }
        }
        return maxHeight * maxWeight;
    }
}
