class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = ""+n;
        
        String[] val = number.split("");
        for(String num : val){
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}