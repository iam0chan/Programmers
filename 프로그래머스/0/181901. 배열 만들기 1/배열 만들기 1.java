class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int length = n/k;
        answer = new int[length];
        
        for(int i=1; i<=answer.length; i++){
            answer[i-1] = k*i;
        }
        
        return answer;
    }
}