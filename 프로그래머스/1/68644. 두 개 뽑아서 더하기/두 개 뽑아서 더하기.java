import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
         
        List<Integer> answerList = new ArrayList<>();
        int sum = 0;
        
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if(!answerList.contains(sum)){
                    answerList.add(sum);
                }
            }
        }
        
        Collections.sort(answerList);
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0 ; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}