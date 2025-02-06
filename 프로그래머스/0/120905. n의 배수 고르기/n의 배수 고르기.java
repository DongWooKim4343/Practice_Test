class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int len=0;
        
        for(int num : numlist){
            if(num%n==0){
                len++;
            }
        }
        
        int[] answer = new int[len];
        
        int index=0;
        for(int num : numlist){
            if(num%n==0){
                answer[index]=num;
                index++;
            }
        }
        
        return answer;
            
        }
    }
