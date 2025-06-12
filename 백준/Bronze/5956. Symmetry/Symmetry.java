import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = cows(N,M);
        

        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();

    }

    static int cows(int N, int M){

        if(N%2==1 && M%2==1){
            return 1+4*cows(N/2, M/2);
        }

        return 0;
    }

}