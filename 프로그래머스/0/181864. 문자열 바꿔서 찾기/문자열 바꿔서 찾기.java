class Solution {
    public int solution(String myString, String pat) {
        
        String str = myString.replace("A","C").replace("B","A").replace("C","B");
        if(str.contains(pat)){
            return 1;
            }
        
        return 0;
    }
}