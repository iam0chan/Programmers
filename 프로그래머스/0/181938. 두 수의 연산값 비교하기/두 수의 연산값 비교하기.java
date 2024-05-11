class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String preConvertNumber = String.valueOf(a)+String.valueOf(b);
        answer = 2*a*b;
        if(Integer.parseInt(preConvertNumber)>answer){
            answer = Integer.parseInt(preConvertNumber);
        }
        return answer;
    }
}