class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x",-1);
        int[] answer = new int[arr.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] =String.valueOf(arr[i]).length();
        }
        return answer;
    }
}