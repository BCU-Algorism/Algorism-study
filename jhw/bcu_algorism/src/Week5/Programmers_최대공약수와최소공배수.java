package Week5;

import java.util.ArrayList;

public class Programmers_최대공약수와최소공배수 {
    public static void main(String[] args) {
        Programmers_최대공약수와최소공배수 p = new Programmers_최대공약수와최소공배수();
        System.out.println("p.solution(2, 5) = " + p.solution(2, 5));
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if (n % m == 0) {
            answer[0] = m;
            answer[1] = n;
        } else if (m % n == 0) {
            answer[0] = n;
            answer[1] = m;
        } else {
            int i = 2;
            int j = 2;
            int nMul = n;
            int mMul = m;
            while (true) {
                if (nMul < mMul) {
                    nMul = n * i;

                    System.out.println("n = " + n);
                    i++;
                } else if (nMul > mMul) {
                    m = m * j;
                    System.out.println("m = " + m);
                    j++;
                } else {
                    answer[1] = n;
                    break;
                }
            }
            ArrayList<Integer> nList = new ArrayList();
            int big = 0;
            int small = 0;
            if (n > m) {
                big = n;
                small = m;
            } else if (n < m) {
                big = m;
                small = n;
            }
            for (int k = 1; k <= small; k++) {
                if (small % k == 0) {
                    nList.add(k);
                }
            }
            for (int k = nList.size() - 1; k >= 0; k--) {
                if (big % nList.get(k) == 0) {
                    answer[0] = nList.get(k);
                    break;
                }
            }

        }
        return answer;
    }
}
