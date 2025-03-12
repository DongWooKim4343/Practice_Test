class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int i=0; i<number.length();i++){
            char c = number.charAt(i);
            answer += Integer.parseInt(c+"");
        
        }
        
        return answer%9;
    }
}