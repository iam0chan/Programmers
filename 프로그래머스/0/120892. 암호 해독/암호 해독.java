class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i=i+code){
            answer += String.valueOf(cipher.charAt(i));
        }
        return answer;
    }
}