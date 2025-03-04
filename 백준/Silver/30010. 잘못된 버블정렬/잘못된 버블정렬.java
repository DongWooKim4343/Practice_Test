import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(input.readLine());
        int[] A = new int[N];
        
        for(int i= 0; i<N; i++){
            A[i]= N-i;
            output.write(String.valueOf(N-i)+" ");
            output.flush();
        }
        
        
    }
}