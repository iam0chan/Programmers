import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List tempArr = new ArrayList();
        
        for(int n : arr){
            for(int i=0; i<n; i++){
                tempArr.add(n);
            }
        }
        System.out.println(tempArr.toString());
        
        answer = new int[tempArr.size()];
        for(int j=0; j<tempArr.size(); j++){
            answer[j] = (int)tempArr.get(j);
        }
        
        
        return answer;
    }
}