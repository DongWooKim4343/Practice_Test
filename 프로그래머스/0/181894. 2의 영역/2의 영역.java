import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int a =0;
        int b=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                a=i;
                break;
            }
        }
                
        for(int i=arr.length-1; i >= 0; i--){
            if(arr[i]==2){
                b=i;
                break;
            }
        }
        
        for(int i=a; i<=b; i++){
            list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        if(a==0 && b==0){
            int[] zero = {-1};
            return zero;
        }else if(a==2 && b!=2 || a!=2 && b==2){
            int[] two ={2};
            return two;
        }
        
        
        
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}