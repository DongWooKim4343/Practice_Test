import java.util.*;

public class Solution {
    public int solution(int n) {
        int battery = 0;
        
        while(n!=0){
            if(n%2==0){
                n/=2;
            }else if(n%2==1){
                n--;
                battery++;
            }
            
        }

        return battery;
    }
}