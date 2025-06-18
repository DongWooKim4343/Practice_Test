import java.io.*;
import java.util.*;

class Main{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        backtracking(0,1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    static void backtracking(int depth, int start){

        if(depth==M){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<=N; i++){

            arr[depth] = i;

            backtracking(depth+1,1+i);

        }
    }
}