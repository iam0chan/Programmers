class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2!=0 && b%2!=0){
            answer = (int)Math.pow(a,2) + (int)Math.pow(b,2);
            System.out.println(answer);
        }else if((a+b)%2!=0){
            answer = 2*(a+b);
        }else{
            answer = a-b;
            if(answer<0){
                answer *= -1;
            }
        }
        return answer;
    }
}