import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());

        long[] arr = new long[num + 1]; 

        arr[0] = 1; 


        for (int i = 1; i <= num; i++) { 
            for (int j = 0; j < i; j++) {
                arr[i] += arr[j] * arr[i - j -1]; 
            }
        }

        output.write(String.valueOf(arr[num])); // 출력 수정
        output.flush();
        output.close(); 
        input.close(); 
    }
}