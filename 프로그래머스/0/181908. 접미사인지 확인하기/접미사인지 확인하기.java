class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int suffix_idx = is_suffix.length()-1;
        int count = 0;
        if(is_suffix.length()<=my_string.length()){
            for(int i=my_string.length()-1; i>=0; i--){
                if(my_string.charAt(i) != is_suffix.charAt(suffix_idx)){
                    break;
                }else{
                    suffix_idx--;
                    count++;
                }
                if(suffix_idx<0){
                    break;
                }
            }
            if(count == is_suffix.length()){
                answer = 1;
            }
        }
        return answer;
    }
}