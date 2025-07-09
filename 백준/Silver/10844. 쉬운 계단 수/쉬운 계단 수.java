import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long MOD = 1_000_000_000L;

        //길이가 i이고 마지막 숫자가 j인 계단 수의 개수
        long[][] dp = new long[N + 1][10];
        
        for (int j = 1; j <= 9; j++) {
            dp[1][j] = 1;
        }

        for (int i = 2; i <= N; i++) {
            // 마지막 숫자가 j일 경우를 계산
            for (int j = 0; j <= 9; j++) {
                // 경우의 수 나누기
                if (j == 0) {
                    // 마지막 숫자가 0이면 그 이전 숫자는 1만 가능
                    dp[i][j] = dp[i-1][1];
                } else if (j == 9) {
                    // 마지막 숫자가 9이면 그 이전 숫자는 8만 가능
                    dp[i][j] = dp[i-1][8];
                } else {
                    //이전 숫자는 j-1 또는 j+1 가능
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
                }
                dp[i][j] %= MOD;
            }
        }


        long totalCount = 0;
        for (int j = 0; j <= 9; j++) {
            totalCount += dp[N][j];
        }

        bw.write(String.valueOf(totalCount % MOD));

        bw.flush();
        bw.close();
        br.close();
    }
}