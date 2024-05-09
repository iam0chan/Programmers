class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double temp = 0.0;
        boolean check = (num1 > 0 && num1<=100) && (num2>0 && num2<=100);
        
        if(check){
            temp = (double)num1/num2;
            answer = (int)(temp*1000);            
            System.out.println(answer);
        }
        
        return answer;
    }
}