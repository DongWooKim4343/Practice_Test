import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(input.readLine());
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=num; i++){
            queue.offer(i);
        }
        
        while(queue.size()!=1){
            queue.poll();
            queue.offer(queue.poll());
        }
        
        output.write(String.valueOf(queue.poll()));
        output.flush();
        output.close();
        input.close();
    }
}