class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int answer = 0;
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        
    
        if(arr[1].equals("*")){
            answer = a*b;
        }else if(arr[1].equals("+")){
            answer = a+b;
        }else if(arr[1].equals("-")){
            answer = a-b;
        }else{
            answer = a/b;
        }
        
        return answer;
    }
}