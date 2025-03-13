import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Queue<Integer> queue = new LinkedList<>();
        
        int num = Integer.parseInt(input.readLine());
        
        for(int i=1; i<=num;i++){
            queue.offer(i);
        }
        
        int i=0;
        while(queue.size()!=1){
            if(i%2==0){
                output.write(String.valueOf(queue.poll()+" "));
            }else if(i%2==1){
                queue.offer(queue.poll());
            }
            i++;
        }
        
        if(queue.size()==1){
            output.write(String.valueOf(queue.poll()));
        }
        
        output.flush();
        output.close();
        input.close();
        
        
        
    }
}