import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int answer = (int)Math.pow(2,N);
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}