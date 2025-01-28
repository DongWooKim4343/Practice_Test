class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int loop=0;
        for(int i =1; i<=n;i+=2){
            answer[loop]=i;
            loop++;
        }
        
        
        return answer;
    }
}