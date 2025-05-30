import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(fibo(n)+"");
        bw.flush();
        bw.close();
        br.close();
    }
    static long fibo(long n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1 ;
        }
        return fibo(n-1)+fibo(n-2);
    }
}