class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] strArr1=str1.split("");
        String[] strArr2=str2.split("");
        
        for(int i =0; i<strArr1.length; i++){
            answer+= strArr1[i] + strArr2[i];
        }
        return answer;
    }
}