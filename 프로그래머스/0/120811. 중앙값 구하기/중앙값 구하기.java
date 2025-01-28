import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int median = (array.length-1)/2;
        
        Arrays.sort(array);
        
        answer = array[median];
        return answer;
    }
}