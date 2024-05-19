import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String strAns = "";
        String[] numArr = new String[String.valueOf(n).length()];
        numArr = String.valueOf(n).split("");
        Arrays.sort(numArr,Collections.reverseOrder());
        
        for(String num : numArr){
            strAns += num;
        }
        answer = Long.parseLong(strAns);
        return answer;
    }
}