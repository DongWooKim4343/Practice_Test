import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        // 1,2,3,4,5
        for(int i = 0; i < d.length; i++){
            if(sum < budget ){
                sum+= d[i];
                if(sum > budget){
                    break;
                }
                answer++;
                
                System.out.println(answer);
            }
        }
        
        return answer;
    }
}