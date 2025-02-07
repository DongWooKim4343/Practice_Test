class Solution {
    
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    
    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    
    public int solution(int n) {
        int answer = 1;
        
        if(n%6==0){
            answer = answer*(n/6);
        }else if(n%6 <6){
            answer = lcm(n, 6)/6;
            
        }
        
        

        
        return answer;
    }
}