class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        answer = Integer.parseInt(a+""+b);
        if(Integer.parseInt(b+""+a)>answer){
            answer = Integer.parseInt(b+""+a);
        }
        return answer;
    }
}