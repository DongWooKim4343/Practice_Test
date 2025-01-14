class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        
        for(int i = 0 ; i<nums.length; i++){
            for(int j = i+1 ; j<nums.length; j++){
                for(int k = j+1 ; k<nums.length; k++){
                
                    sum= nums[i]+nums[j]+nums[k];
                    int check=0;
                    for(int l = 1; l<=sum; l++){

                        if(sum%l==0){
                            check++;
                        }
                    }
                    if(check < 3 ){
                        answer++;
                    }
                    }
            }
        }


        return answer;
    }
}