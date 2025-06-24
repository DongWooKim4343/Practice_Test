import java.util.*;
import java.io.*;

class Main{
    static boolean[] visit;
    static int[] ansArr;
    static int N, M;
    static int[] numArr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        numArr = new int[N];
        ansArr = new int[M];
        visit = new boolean[10001];

        for(int i=0; i<N; i++){
            numArr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);

        backtracking(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static void backtracking(int depth){
        if(depth == M){
            for(int num : ansArr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++ ){
            int n = numArr[i];

            if(!visit[n]){
                visit[n]=true;
                ansArr[depth] = n;
                backtracking(depth+1);
                visit[n]=false;
            }

        }
    }
}