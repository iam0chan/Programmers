class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1;
        int sum = 0;
        for(int n : num_list){
            multiply *= n;
            sum += n;
        }
        if(multiply<Math.pow(sum,2)){
            answer = 1;
        }
        return answer;
    }
}