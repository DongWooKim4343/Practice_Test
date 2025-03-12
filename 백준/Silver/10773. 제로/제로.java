import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int answer =0;
        
        int num = Integer.parseInt(input.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i< num; i++){
            int n = Integer.parseInt(input.readLine());
            if(n==0){
                stack.pop();
            }else{
                stack.push(n);
            }
        }
        
        for(int i=0; i< stack.size(); i++){
            answer+=stack.get(i);
        }
        
        output.write(String.valueOf(answer));
        output.flush();
        
        
        
        
    }
    
}