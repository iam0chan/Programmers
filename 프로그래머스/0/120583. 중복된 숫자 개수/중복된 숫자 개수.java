class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        if(array!=null && array.length>0){
            int count = 0;
            for(int val : array){
                if(val==n){
                    count++;
                }
            }
            answer = count;
        }
        return answer;
    }
}