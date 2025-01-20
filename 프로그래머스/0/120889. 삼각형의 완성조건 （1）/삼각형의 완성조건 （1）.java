class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int temp = 0;
        int sum = 0;
        
        for(int i = 0 ; i < sides.length; i++){
            if(temp<=sides[i]){
                temp=sides[i];
            }
            sum+=sides[i];
        }
        if(temp < (sum-temp)){
            answer =1;
        }else{
            answer =2;
        }
        

        
        return answer;
    }
}