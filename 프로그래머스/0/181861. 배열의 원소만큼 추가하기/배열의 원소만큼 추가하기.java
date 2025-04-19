import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int index = 0;
        while(index < arr.length){
            int aa = arr[index];
            
            for(int i=0; i<aa; i++){
                list.add(arr[index]);
            }
            index++;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}