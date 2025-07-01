import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[N+1];

            int st=4;
            if(N>=3){
                dp[3]=1;
                dp[2]=1;
                dp[1]=1;
            }else if(N == 2){
                dp[2]=1;
                dp[1]=1;
                st=3;
            }else if(N == 1){
                dp[1]=1;
                st=2;
            }

            for(int j=st; j<=N; j++){
                dp[j] = dp[j-2]+dp[j-3];
            }
            sb.append(dp[N]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}