import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        // dp[i][]: i번째 집을 칠했을 때의 누적 최소 비용 0빨강, 1초록, 2파랑
        int[][] dp = new int[N + 1][3];

        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rCost = Integer.parseInt(st.nextToken());
            int gCost = Integer.parseInt(st.nextToken());
            int bCost = Integer.parseInt(st.nextToken());

            // i번째 집을 빨강으로 칠하는 경우 i-1번째 집은 다른색깔
            // 둘 중 더 저렴했던 비용 + 현재 집을 빨강으로 칠하는 비용
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + rCost;
            
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + gCost;
            
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + bCost;
        }

        
        int answer = Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2]));

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}