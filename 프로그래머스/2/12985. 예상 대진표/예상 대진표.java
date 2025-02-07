class Solution
{
    public int solution(int n, int a, int b)
    {
        //순서대로 토너먼트
        int answer = 0;
        
        while(a!=b){
            if(a%2!=0){
                if(a!=1){
                    a++;
            }
            
        }
            if(b%2!=0){
                if(b!=1){
                    b++;
                }
                
        }
            if(a!=1){
                a /=2;
            }
            if(b!=1){
                b /=2;
            }
            
            
            answer++;
        }



        return answer;
    }
}