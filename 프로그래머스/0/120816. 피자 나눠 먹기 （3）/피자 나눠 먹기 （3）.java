class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int order = slice;
        
        
        while(order < n){
            if(order < n){
                order+= slice;
                answer+= 1;
            }
        }
        
        return answer;
    }
}