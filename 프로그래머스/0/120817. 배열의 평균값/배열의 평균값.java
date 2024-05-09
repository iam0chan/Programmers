class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double temp = 0;
        int size = numbers.length;
        for(int val : numbers){
            temp += val;
        }
        answer = temp / size;
        return answer;
    }
}