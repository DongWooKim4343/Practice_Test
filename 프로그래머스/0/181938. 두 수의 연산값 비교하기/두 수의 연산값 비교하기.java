class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(""+a+b);
        
    
        int c = 2*a*b;
        
        if(ab>=c){
            answer=ab;
        }else{
            answer=c;
        }
        
        return answer;
    }
}