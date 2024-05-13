class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String replaceValue = "";
        for(int i=0; i<pat.length(); i++){
            if(pat.charAt(i)=='A'){
                replaceValue += 'B';
            }else{
                replaceValue += 'A';
            }
        }
        if(myString.indexOf(replaceValue)!=-1){
            answer = 1;
        }
        return answer;
    }
}