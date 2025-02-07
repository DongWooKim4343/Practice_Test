class Solution
{
    public int solution(int n, int a, int b)
    {
        //순서대로 토너먼트
        int answer = 0;
        
        while(a!=b){
                a =(a+1)/2;
                b =(b+1)/2;
            
            answer++;
        }



        return answer;
    }
}