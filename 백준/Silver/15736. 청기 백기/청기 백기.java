import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=1; i*i<=n; i++){
            count++;
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}