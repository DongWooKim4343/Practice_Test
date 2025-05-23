import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int kk = 1;
        int nn = 1;


        for(int i=0; i<K; i++){
            nn *= N-i;
            kk *= K-i;
        }
        int answer =nn/kk;

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}