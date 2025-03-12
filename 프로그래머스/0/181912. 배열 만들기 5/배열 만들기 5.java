import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i< intStrs.length; i++){
            String str =intStrs[i];
            String ss ="";
            for(int j = s ; j< s+l; j++){
                ss +=str.charAt(j);
            }
            int num = Integer.parseInt(ss);
            
            if(num > k ){
                list.add(num);
            }
        }
        
        int[] arr = new int[list.size()];
        
        for(int i=0; i<arr.length; i++){
            arr[i]=list.get(i);
        }
        
        

        
        
        
        return arr;
    }
}