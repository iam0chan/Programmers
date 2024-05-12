import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> temp = new ArrayList<String>();
        for(String data : strArr){
            if(!data.contains("ad")){
                temp.add(data);
            }
        }
        int size = temp.size();
        answer = temp.toArray(new String[size]);
        
        return answer;
    }
}