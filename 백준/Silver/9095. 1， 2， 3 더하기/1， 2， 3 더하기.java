import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(input.readLine());

        for(int i=0; i<count; i++){
            int num = Integer.parseInt(input.readLine());
            int[] arr = new int[11];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 4;
            for(int j=3; j<arr.length;j++){
                arr[j] = arr[j-3]+arr[j-2]+arr[j-1];
            }
            output.write(String.valueOf(arr[num-1]));
            output.newLine();
        }
        output.flush();



    }
}