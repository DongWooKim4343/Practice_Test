class Solution {
    public String solution(int[] food) {
        String answer = "";
    
        for(int i=1; i< food.length; i++){
            for(int j =1; j<=500;j++ ){
            if((food[i]/2)==j){
                for(int k=j; k>0; k--)
                answer= answer+i;
            }
        }
    }
        answer = answer + 0;
        
        for(int i=food.length-1; i>0; i--){
            for(int j =1; j<=500;j++ ){
            if((food[i]/2)==j){
                for(int k=j; k>0; k--)
                answer= answer+i;
            }
        }
    }
        
        // for(int i=food.length-1; i> 0; i--){
        //     if((food[i]/2)==1){
        //         answer= answer+i;
        //     }else if((food[i]/2)==2){
        //         answer= answer+i;
        //         answer= answer+i;
        //     }else if((food[i]/2)==3){
        //         answer= answer+i;
        //         answer= answer+i;
        //         answer= answer+i;
        //     }else if((food[i]/2)==4){
        //         answer= answer+i;
        //         answer= answer+i;
        //         answer= answer+i;
        //         answer= answer+i;
        //     }
        // }
        
        return answer;
    }
}