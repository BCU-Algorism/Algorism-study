
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static String solution(int n) {
        String answer = "";
        String[] numbers = {"4", "1", "2"};


        while(n > 0){
            int afterMod = n % 3;
            n /= 3;

            if(afterMod == 0) n--;
            answer = numbers[afterMod] + answer;
        }

        return answer;
    }
}

class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Solution.solution(4) = " + Solution.solution(9));

    }
}