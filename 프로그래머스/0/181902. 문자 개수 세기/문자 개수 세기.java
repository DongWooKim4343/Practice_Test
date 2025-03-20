class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++){
            int index = (int)my_string.charAt(i);
            if(index >= 'A' && index <= 'Z'){
                answer[index-65]++;
            }else{
                answer[index-97+26]++;
            }
        }
        
        return answer;
    }
}