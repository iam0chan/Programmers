class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        int length = 0;
        int idx=0;
        if(names.length%5!=0){
            length = names.length/5 + 1;
        }else{
            length = names.length/5;
        }
        answer = new String[length];
        
        for(int i=0; i<names.length; i++){
            if(i%5==0){
                answer[idx++] = names[i];
            }
        }
        
        return answer;
    }
}