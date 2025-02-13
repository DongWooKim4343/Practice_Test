import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(input.readLine()); 

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(input.readLine());
            int n = Integer.parseInt(input.readLine());

            int[][] dp = new int[k + 1][n + 1]; // 0층부터 k층, 1호부터 n호까지

            // 기저 조건: 0층 초기화
            for (int j = 1; j <= n; j++) {
                dp[0][j] = j;
            }

            // 점화식
            for (int a = 1; a <= k; a++) {
                for (int b = 1; b <= n; b++) {
                    dp[a][b] = dp[a][b-1] + dp[a-1][b];  // 두번째 식
                }
            }

            output.write(dp[k][n] + "\n"); // k층 n호의 사람 수 출력
            output.flush();
        }
    }
}