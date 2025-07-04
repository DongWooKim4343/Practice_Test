import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[1000001];

        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<=N; i++){
            arr[i] = (arr[i-1]+arr[i-2]) % 15746 ;
        }


        bw.write(arr[N]+"");
        bw.flush();
        bw.close();
        br.close();

    }

}