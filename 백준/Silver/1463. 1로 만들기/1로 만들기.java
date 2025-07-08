import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        
        for (int i = 2; i <= n; i++) {
            
            // 기본적으로 1을 빼는 경우를 먼저 
            // i는 i-1에서 1을 빼는 연산을 통해 올 수 있으므로 횟수는 dp[i-1] + 1이다.
            dp[i] = dp[i - 1] + 1;

            
            if (i % 2 == 0) {
                // (1을 빼는 경우)와 (2로 나누는 경우) 중 더 작은 값을 dp[i]에 저장한다.
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            
            if (i % 3 == 0) {
                // 현재 dp[i] 값과 (3으로 나누는 경우) 중 더 작은 값을 dp[i]에 저장한다.
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }


        bw.write(dp[n]+"");
        bw.flush();
        bw.close();
        br.close();
    }
}