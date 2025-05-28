import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = -1;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int bp = Integer.parseInt(st.nextToken());
            int sq = Integer.parseInt(st.nextToken());
            int dl = Integer.parseInt(st.nextToken());
            int sum = bp+sq+dl;

            if(sum >= 512){
                int aa = Math.abs(answer - 512);
                int bb = sum -512;

                if( bb < aa){
                    answer = sum;
                }
            }
        }

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();



    }
}