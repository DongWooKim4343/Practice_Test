class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        
        int index = s + overwrite_string.length();
        if(index < my_string.length()){
            answer+= my_string.substring(index);
        }
    
    

        
        return answer;
    }
}