import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            int target = Integer.parseInt(input.readLine());
            if(target==0){
                break;
            }
            int[] envelopes = new int[51];
            int st = 1;
            int en =50;
            List<Integer> list = new ArrayList<>();
            
            while(true){
                int mid =(st+en)/2;
                list.add(mid);
                if(target > mid){
                    st = mid+1;
                }else if(target < mid){
                    en =mid-1;
                }else if(target == mid){
                    
                    break;
                }else if(st > en){
                    break;
                }
                
                
            }
            for(int i=0; i<list.size();i++){
            output.write(String.valueOf(list.get(i)+" "));
            }
            output.flush();
        }
        
    }
}