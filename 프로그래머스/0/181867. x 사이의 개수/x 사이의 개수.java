class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        int length = 0;
        String temp ="";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                length++;
            }
        }
        answer = new int[length+1];
        for(int j=0, k=0; j<myString.length(); j++){
            if(myString.charAt(j)!='x'){
                temp += myString.charAt(j);
                if(myString.length() == j+1){
                    answer[k++] = temp.length();
                    temp = "";
                }
            }else if(myString.charAt(j)=='x'){
                answer[k++] = temp.length();
                temp = "";
            }
        }
        return answer;
    }
}