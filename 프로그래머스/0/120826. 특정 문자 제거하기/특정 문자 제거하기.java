class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        boolean check = my_string.length()>=1 && my_string.length()<=100;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)==letter.charAt(0)){
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}