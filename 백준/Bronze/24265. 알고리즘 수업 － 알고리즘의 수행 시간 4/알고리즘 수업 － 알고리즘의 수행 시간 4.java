import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long count = 0;

        if(n==1) {

        }else {
            count = n*(n-1)/2;
        }

        bw.write(count+"\n");
        bw.write("2\n");
        bw.flush();
        bw.close();
        br.close();



    }
}