class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] numArr = String.valueOf(x).split("");
        int positionSum = 0;
        for(String num : numArr){
            positionSum += Integer.parseInt(num);
        }
        answer = x%positionSum==0?true:false;
        return answer;
    }
}