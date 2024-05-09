class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot !=null && dot.length==2){
            int sign = 0;
            sign = dot[0]*dot[1];
           System.out.println(sign);
            if(sign<0){
                //2,4사분면
                if(dot[0]<0){
                    answer = 2;
                }else{
                    answer = 4;    
                }
            }else{
                //1,3사분면
                if(dot[0]<0){
                    answer = 3;
                }else{
                    answer = 1;    
                } 
            }
        }
        return answer;
    }
}