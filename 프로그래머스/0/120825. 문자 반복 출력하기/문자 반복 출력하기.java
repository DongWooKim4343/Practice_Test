class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for(String s : arr){
            for(int j=1; j<=n; j++){
                answer += s;
            }
            
        }
        
        return answer;
    }
}