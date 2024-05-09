class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = n>0 && n<=1000;
        if(check){
            for(int i=2; i<=n;i++){
                answer += i;
                i++;
            }
        }
        return answer;
    }
}