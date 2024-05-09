class Solution {
    public String solution(String my_string) {
        String answer = "";
        char convert = ' ';
        for(int i=0; i<my_string.length();i++){
            if(my_string.charAt(i)>=65 && my_string.charAt(i)<=90){
                convert = (char)(my_string.charAt(i)+32);
                answer += String.valueOf(convert);
            }else{
                convert = (char)(my_string.charAt(i)-32);
                answer += String.valueOf(convert);
            }
        }
        return answer;
    }
}