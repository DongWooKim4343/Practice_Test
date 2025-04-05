import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); //버스의 개수
        int T = Integer.parseInt(st.nextToken()); //터미널 도착시간
        
        int minWait = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            
            int S = Integer.parseInt(st2.nextToken()); //버스 시작시간
            int I = Integer.parseInt(st2.nextToken()); // 간격
            int C = Integer.parseInt(st2.nextToken()); // 대수
            
            for (int k = 0; k < C; k++) {
                //시작시간
                int departure_time = S + k * I;

                
                if (departure_time >= T) {
                    //시작시간-도착시간이 기다리는 시간
                    int wait_time = departure_time - T;
                    
                    minWait = Math.min(minWait, wait_time);

                    break;
                }
               
            }
            
        }

        
        if (minWait == Integer.MAX_VALUE) {
            bw.write(-1+"");
        } else {
            // 찾은 최소 대기 시간을 출력.
            bw.write(minWait+"");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}