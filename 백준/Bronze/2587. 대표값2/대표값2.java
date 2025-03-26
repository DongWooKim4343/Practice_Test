import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int sum =0;
        int num =0;
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            num = Integer.parseInt(input.readLine());
            arr[i]=num;
            sum += num;
        }
        
        Arrays.sort(arr);
        
        output.write(String.valueOf(sum/5)+"\n");
        output.write(String.valueOf(arr[2]));
        output.flush();
        output.close();
        input.close();
    }
}