class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        for(int i=0; i<num_list.length; i++){
            int temp = num_list[i];
            for(int j = i+1; j<num_list.length; j++){
                if(num_list[i]>num_list[j]){
                    temp = num_list[j];
                    num_list[j] = num_list[i];
                    num_list[i] = temp;
                }
            }
        }
        answer = new int[5];
        System.arraycopy(num_list,0,answer,0,5);
        
        
        return answer;
    }
}