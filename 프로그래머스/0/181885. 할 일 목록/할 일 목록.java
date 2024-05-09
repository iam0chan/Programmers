class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer;
        int answerLength = 0;
        for(boolean b : finished){
            if(b==false){
                answerLength++;
            }
        }
        answer = new String[answerLength];
        for(int i=0, j=0; i<todo_list.length; i++){
            if(finished[i]==false){
                answer[j] = todo_list[i];
                j++;
            }
        }
        return answer;
    }
}