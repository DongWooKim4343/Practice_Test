import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Long> map = new HashMap<>();

        long max = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Xi = Integer.parseInt(st.nextToken()); //i번째 은행 위치
            int Ti = Integer.parseInt(st.nextToken()); // 시간
            int Ci = Integer.parseInt(st.nextToken()); //돈

            //이 값이 같은 애들이어야 돈이 누적됨 시간이 0 일때 시작좌표위치
            int key =Ti-Xi;

            long temp = map.getOrDefault(key,0L);
            long sum = temp+Ci;
            map.put(key,sum);
            max = Math.max(sum,max);
        }

        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();




    }
}