import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer=my_string;
        
        String[] arr = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i<arr.length; i++){
            answer = answer.replaceAll(arr[i], "");
        }
        
        return answer;
    }
}