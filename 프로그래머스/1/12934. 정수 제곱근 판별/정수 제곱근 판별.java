class Solution {
    public long solution(long n) {
        long answer = 0;
        int x = (int)Math.sqrt(n);
        
        if((long)Math.pow(x,2)==n){
            answer = (long)Math.pow((x+1),2);
        }else{
            answer = -1;
        }
        return answer;
    }
}