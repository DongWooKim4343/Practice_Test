class Solution {
    public int solution(int n) {
        int answer = -1;
        double person = n;
        while((person/7)>(double) answer){
            answer++;
        }
        
        
        return answer;
    }
}