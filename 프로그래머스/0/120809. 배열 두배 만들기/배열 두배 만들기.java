class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        if(numbers!=null && numbers.length>0){
            answer = new int[numbers.length];
            for(int i=0; i<answer.length; i++){
                answer[i] = numbers[i]*2;
            }
        }
        return answer;
    }
}