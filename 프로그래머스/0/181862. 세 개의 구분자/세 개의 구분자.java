import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        String[] answer = new String[st.countTokens()];
        
        if (answer.length == 0) {
            return new String[]{"EMPTY"};
        }
        
        while(st.hasMoreTokens()){
            for(int i=0; i<answer.length; i++){
                answer[i] = st.nextToken();
            }
        }
        
        if(answer[0].equals("")){
            answer[0]="EMPTY";
        }
        
        return answer;
    }
}