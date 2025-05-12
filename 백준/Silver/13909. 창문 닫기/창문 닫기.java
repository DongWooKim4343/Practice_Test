import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double nnn = Math.sqrt(n);

        int count = (int) nnn;

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}