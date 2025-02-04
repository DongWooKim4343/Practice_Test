import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        Set<Integer> hash = new HashSet<>();
        
        for(int i = 0; i<nums.length;i++){
            hash.add(nums[i]);
        }
        if(max>hash.size()){
            answer =hash.size();
        }else{
            answer=max;
        }
            
        
        
        return answer;
    }
}