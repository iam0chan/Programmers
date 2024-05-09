class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int temp = 0;
        for(int i=0; i<sides.length; i++){
            for(int j=i+1; j<sides.length; j++){
                if(sides[i]>sides[j]){
                    temp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = temp;
                }
            }
        }
        temp = 0;
        for(int k=0; k<sides.length; k++){
            if(k!=sides.length-1){
                temp += sides[k];    
            }else{
                if(temp<=sides[sides.length-1]){
                    answer = 2;
                }else{
                    answer = 1;
                }
            }
            
        }
        return answer;
    }
}