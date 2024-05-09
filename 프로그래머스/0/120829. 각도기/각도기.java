class Solution {
    public int solution(int angle) {
        int answer = 0;
        boolean check = angle>0 && angle<=180;
        
        if(check){
            double result = 0.0;
            result = (double)angle/90;
            
            if(result<1){
                answer = 1;
            }else if(result>1 && result<2){
                answer = 3;
            }else{
                answer = result==1.0?2:4;
                System.out.println(answer);
            }
        }
        
        return answer;
    }
}