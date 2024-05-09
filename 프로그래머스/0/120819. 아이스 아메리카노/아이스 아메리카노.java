class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;
        boolean check = money>0 && money<=1000000;
        if(check){
            int temp = money;
            answer[0] = money/coffee;
            temp -= answer[0]*coffee;
            answer[1] = temp;
                
        }
        return answer;
    }
}