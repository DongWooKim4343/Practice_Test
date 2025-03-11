class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        //a 첫째항
        //b 공차
        
        int[] arr = new int[included.length];
        
        for(int i =0; i<arr.length; i++){
            if(i==0){
                arr[i] = a;
  
            }else{
                arr[i] = arr[i-1]+ d;
 
            }
        }
        
        for(int j=0; j<included.length; j++){
            if(included[j]){
                answer+=arr[j];
            }
        }

        
        return answer;
    }
}