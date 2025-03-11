class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && a==c){
            answer = (a*a*a+ b*b*b +c*c*c)*(a*a+ b*b +c*c)*(a+ b +c);
        }else if(a==b && a!=c || b==c && b!=a || a==c && a!=b){
            answer = (a*a+ b*b +c*c)*(a+ b +c);
        }else{
            answer = (a+ b +c);
        }
        
        return answer;
    }
}