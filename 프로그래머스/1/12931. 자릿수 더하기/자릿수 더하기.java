import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] numArr = new String[(String.valueOf(n)).length()];
        numArr = (String.valueOf(n)).split("");
        for(String num : numArr){
            answer += Integer.parseInt(num);
        }
        
        
        return answer;
    }
}