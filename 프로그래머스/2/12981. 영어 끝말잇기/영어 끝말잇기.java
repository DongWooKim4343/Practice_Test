import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        Set<String> hashSet = new HashSet<>();
        int count = 0;
        int turn = 1;
        
        
        for(int i =0; i<words.length; i++){
            if (i > 0) { // 첫 번째 단어는 비교할 이전 단어가 없으므로 i > 0 조건 필요
                char finalChar = words[i - 1].charAt(words[i - 1].length() - 1);
                char firstChar = words[i].charAt(0);

            if (finalChar != firstChar) {
                break;
            }
            }
                
            if(hashSet.contains(words[i])){
                break;
            }else{
                hashSet.add(words[i]);
            }
                
            if(count==n-1){
                count=0;
                turn++;
            }else{
                count++;
            }
            if(i==words.length-1){
                count=-1;
                turn=0;
                break;
            }
        }
        
        int[] answer = {count+1,turn};

        return answer;
    }
}