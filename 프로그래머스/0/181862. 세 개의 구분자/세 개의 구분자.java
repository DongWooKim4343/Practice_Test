import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        
        StringBuilder sb = new StringBuilder();
        boolean bbb = true;
        for(int i=0; i<myStr.length(); i++){
            char c = myStr.charAt(i);
            if(c == 'a' || c == 'b' || c == 'c'){
                sb.append(" ");
            }else{
                sb.append(c);
                bbb =false;
            }
        }
        
        
        
        String[] answer = sb.toString().trim().split("\\s+");
        if(answer[0].equals("")){
            answer[0] = "EMPTY";
        }
        return answer;
    }
}