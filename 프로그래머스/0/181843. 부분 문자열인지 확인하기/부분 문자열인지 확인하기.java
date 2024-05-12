class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int count = 0;
        int nextIdx = 0;
//         if(my_string.length()>=target.length()){
//             for(int i = 0; i<my_string.length(); i++){
//                 if(my_string.charAt(i) == target.charAt(nextIdx)){
//                     count++;
//                     nextIdx++;
//                     System.out.println(count);
//                 }else{
//                     nextIdx = 0;
//                 }
              
//                 if(nextIdx == target.length()){
//                     if(target.length() == count){
//                         return 1;
//                     }
//                 }
//             }
//         }
        if(my_string.length()>=target.length()){
            answer = my_string.indexOf(target)!=-1?1:0;
        }
        return answer;
    }
}