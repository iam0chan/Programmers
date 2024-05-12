class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i=0; i<num_str.length(); i++){
            if(num_str.charAt(i)=='0'){
                continue;
            }else{
                answer += Integer.parseInt(""+num_str.charAt(i));
            }
        }
        return answer;
    }
}