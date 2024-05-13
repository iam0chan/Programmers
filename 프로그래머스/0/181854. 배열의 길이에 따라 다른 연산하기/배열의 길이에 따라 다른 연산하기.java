class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        answer = new int[arr.length];
        System.arraycopy(arr,0,answer,0,arr.length);
        if(arr.length%2 == 0){            
            for(int i=1; i<arr.length; i+=2){
                 answer[i] = arr[i]+n;
            }
        }else{
            for(int i=0; i<arr.length; i+=2){
                 answer[i] = arr[i]+n;
            }
        }
        
        return answer;
    }
}