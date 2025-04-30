import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        long N = Long.parseLong(br.readLine());
        long count = N*(N-1)*(N-2) / 6;



        bw.write(count+"\n");
        bw.write("3");
        bw.flush();
        bw.close();
        br.close();




    }
}