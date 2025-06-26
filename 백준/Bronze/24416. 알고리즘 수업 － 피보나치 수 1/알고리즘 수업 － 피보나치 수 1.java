import java.io.*;
import java.util.*;

class Main{
    static int reCount;
    static int count;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);

        bw.write(reCount+" "+count);
        bw.flush();
        bw.close();
        br.close();


    }
    static int fib(int n){

        if(n==1 || n==2){
            reCount++;
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    static int fibonacci(int n){

        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 2;

        for(int i=3; i<=n; i++){
            count++;
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }

}