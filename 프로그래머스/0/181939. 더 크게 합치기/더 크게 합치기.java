class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // answer = Integer.parseInt(a+""+b);
        String convertIntegerToString = String.valueOf(a)+String.valueOf(b);
        answer = Integer.parseInt(convertIntegerToString);
        if(Integer.parseInt(String.valueOf(b)+String.valueOf(a))> answer){
            answer = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        }
        // if(Integer.parseInt(b+""+a)>answer){
        //     answer = Integer.parseInt(b+""+a);
        // }
        return answer;
    }
}