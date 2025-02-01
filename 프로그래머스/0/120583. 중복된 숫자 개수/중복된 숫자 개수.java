class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] answerArr = new int[1000];
        for(int i = 0 ; i<array.length; i++){
            answerArr[array[i]]++;
        }
        answer=answerArr[n];
        return answer;
    }
}