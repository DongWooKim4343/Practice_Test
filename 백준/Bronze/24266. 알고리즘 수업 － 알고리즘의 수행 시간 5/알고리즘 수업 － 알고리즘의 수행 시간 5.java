import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        long N = Long.parseLong(br.readLine());

        long sum = N*N*N;


        bw.write(sum+"\n");
        bw.write("3");
        bw.flush();
        bw.close();
        br.close();




    }
}