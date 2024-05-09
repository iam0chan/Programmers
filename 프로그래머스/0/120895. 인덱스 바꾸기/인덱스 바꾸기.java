class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String temp = "";
        for(int i=0; i<my_string.length();i++){
            if(i == num1){
                temp = String.valueOf(my_string.charAt(i));
                answer += "*";
            }else if(i==num2){
                answer = answer.replace("*",String.valueOf(my_string.charAt(i)));
                answer += temp;
            }else{
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}