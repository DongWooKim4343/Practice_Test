import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int str = Integer.parseInt(st.nextToken());
        int dex = Integer.parseInt(st.nextToken());
        int intt = Integer.parseInt(st.nextToken());
        int luk = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int answer = 0;

        int sum = str+dex+intt+luk;


        while(sum/4 < N) {
            sum ++;
            answer++;

        }


        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
}