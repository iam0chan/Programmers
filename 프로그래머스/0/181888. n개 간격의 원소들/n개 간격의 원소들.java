class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int length = 0;
        int idx=0;
        if(num_list.length%n!=0){
            length = (num_list.length/n)+1;
        }else{
            length = num_list.length/n;
        }
        answer = new int[length];
        for(int i=0; i<num_list.length; i+=n){
            answer[idx++] = num_list[i];
        }

        return answer;
    }
}