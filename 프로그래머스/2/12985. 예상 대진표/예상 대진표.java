class Solution
{
    public int solution(int n, int a, int b)
    {
        //순서대로 토너먼트
        int answer = 0;
        
         while (a!=b) { 
            
            if (a % 2 != 0) { // a가 홀수이면
                a = (a + 1) / 2;  // 다음 라운드 번호 계산
            } else { // a가 짝수이면
                a /= 2;
            }
            
            if (b % 2 != 0) { // b가 홀수이면
                b = (b + 1) / 2;
            } else { // b가 짝수이면
                b /= 2;
            }

            answer++;
        }

        return answer;
    }
}