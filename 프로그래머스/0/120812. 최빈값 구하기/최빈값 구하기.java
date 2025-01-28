class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];
        
        for(int i = 0; i<array.length; i++){
             arr[array[i]]++;
        }
        
        int max = 0;
        for(int i =0; i< arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
                answer = i;
        
            }else if(max==arr[i]){
                answer = -1;
            }
        }

        
        return answer;
    }
}