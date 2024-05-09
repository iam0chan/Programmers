class Solution {
    public int solution(int age) {
        int answer = 0;
        int year = 2022;
        boolean check = age>0 && age<=120;
        
        if(check){
            answer = (year-age)+1;
        }
        
        return answer;
    }
}