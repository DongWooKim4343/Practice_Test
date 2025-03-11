class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int zero =0;
        int one =0;
        
        for(int i=0; i<queries.length; i++){
            zero = queries[i][0];
            one = queries[i][1];
            
            int temp = arr[zero];
            arr[zero] = arr[one];
            arr[one] = temp;
            
            
        }
        
        return arr;
    }
}