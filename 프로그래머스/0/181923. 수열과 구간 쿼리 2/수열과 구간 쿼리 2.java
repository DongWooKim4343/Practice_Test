class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        
        for(int i=0; i<queries.length; i++){
            int min = 10000000;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for( int j=0; j< arr.length; j++){
                if(j >= s && j <= e){
                    if(arr[j]>k){
                        if(min>arr[j]){
                            min=arr[j];
                        }
                    }
                }
            }
            if(min<10000000){
                answer[i]=min;
            }else{
                answer[i]=-1;
            }
            
        }
        
        return answer;
    }
}