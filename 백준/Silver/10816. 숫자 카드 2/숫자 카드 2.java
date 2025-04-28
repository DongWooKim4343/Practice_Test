import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M ; i++){
            int num = Integer.parseInt(st.nextToken());
            int answer = map.getOrDefault(num, 0);
            sb.append(answer).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }
}