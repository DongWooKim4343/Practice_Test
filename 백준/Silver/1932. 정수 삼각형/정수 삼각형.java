import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][n+1];


        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=1; j<=i; j++){
                dp[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                
                // 맨 왼쪽은 위층의 오른쪽에서만
                if (j == 1) {
                    dp[i][j] = dp[i][j] + dp[i-1][j];
                }
                // 맨 오른쪽 열 
                else if (j == i) {
                    dp[i][j] = dp[i][j] + dp[i-1][j-1];
                }
    
                else {
                    dp[i][j] = dp[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
                }
            }
        }
        
        int max = 0;
        for (int j = 1; j <= n; j++) {
            if (dp[n][j] > max) {
                max = dp[n][j];
            }
        }

        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
}