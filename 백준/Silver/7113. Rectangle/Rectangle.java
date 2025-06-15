import java.io.*;
import java.util.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int answer = rectangle(N, M);


        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
    static int rectangle(int n, int m){
        count++;
        if(n==1 & m==1){
            return count;
        }else if(n==m){
            return count;
        }


        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int newN = max-min;
        int newM = min;

        return rectangle(newN,newM);
    }
}