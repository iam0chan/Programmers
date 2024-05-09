class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean check = num1>=0 && num1<=100 && num2>=0 && num2<=100;
        if(check){
            answer = num1 * num2;
        }
        return answer;
    }
}