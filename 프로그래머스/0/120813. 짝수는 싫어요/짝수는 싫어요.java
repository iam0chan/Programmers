class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int size = n/2;
        int cnt = 1;
        if(n%2==0){
            answer = new int[size];
        }else{
            answer = new int[size+1];
        }
        answer[0] = 1;
        for(int i=2; i<=n; i++){
            if(i%2==0){
                continue;
            }else{
                answer[cnt++] = i;
            }
        }
        return answer;
    }
}