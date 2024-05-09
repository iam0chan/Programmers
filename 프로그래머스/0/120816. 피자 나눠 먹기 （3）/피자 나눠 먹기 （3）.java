class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        boolean check = slice>=2 && slice <=10 && n>=1 && n<=100;
        if(check){
            double result = (double)n/slice;
            answer = (int)(Math.ceil(result));
        }
       //answer = (double)n%slice==0?n/slice:(n/slice)+1;
        return answer;
    }
}