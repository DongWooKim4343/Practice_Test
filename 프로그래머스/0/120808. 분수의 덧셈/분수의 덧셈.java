class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        
        int gcdValue = gcd(numer,denom);

        
        int[] answer ={numer/gcdValue, denom/gcdValue};
        
        
        return answer;
    }
            
    public int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}