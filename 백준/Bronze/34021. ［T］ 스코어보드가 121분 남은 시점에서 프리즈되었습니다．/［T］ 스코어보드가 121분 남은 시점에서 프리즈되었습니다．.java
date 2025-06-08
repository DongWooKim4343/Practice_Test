import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //참가자
            int M = Integer.parseInt(st.nextToken()); //M분간 진행
            int L = Integer.parseInt(st.nextToken()); //L분 남았을때

            int remain=0;

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int time =Integer.parseInt(st.nextToken());

                if(time != -1){
                    // 가장 먼저 문제를 푼 사람 = 남은 시간이 가장 많은 사람
                    remain = Math.max(remain, M - time);
                }
            }

            int freezeTime = Math.max(L, remain);
            
            sb.append("The scoreboard has been frozen with ").append(freezeTime);
            if (freezeTime == 1) {
                sb.append(" minute remaining.\n");
            } else {
                sb.append(" minutes remaining.\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
