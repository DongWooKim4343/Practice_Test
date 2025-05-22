import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //수의 개수
        int M = Integer.parseInt(st.nextToken()); // 합을 구해야하는 수

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] sum = new int[N+1];

        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum[i+1]=sum[i]+arr[i];
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int iii = Integer.parseInt(st.nextToken());
            int jjj = Integer.parseInt(st.nextToken());
            int answer = sum[jjj]-sum[iii-1];
            sb.append(answer).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
}