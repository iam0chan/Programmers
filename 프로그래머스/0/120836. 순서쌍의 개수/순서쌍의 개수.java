class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = n;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                k = n/i;
            }else{
                continue;
            }
            for(int j=k; j>0;j--){
                if(i*j == n){
                    answer++;
                    break;
                }
            }           
        }
        return answer;
    }
}