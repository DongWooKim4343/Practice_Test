import java.io.*;
import java.util.*;

class Main{
    static int N,M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        backtracking(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static void backtracking(int depth){
        if(depth == M){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=N; i++){
            arr[depth]=i;
            backtracking(depth+1);
        }
    }
}