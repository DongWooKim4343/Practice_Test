import java.io.*;
import java.util.*;

class Main{

    static int M;
    static int N;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];//출력해야하는 수열 길이
        visit = new boolean[N+1];

        backtracking(0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static void backtracking(int depth){
        if(depth==M){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=N; i++){
            if(!visit[i]){
                // 방문 체크
                visit[i] = true;

                // 수열의 현재 깊이 위치에 해당 숫자를 저장
                arr[depth] = i;

                // 다음 깊이로 재귀 호출 (depth + 1)
                backtracking(depth + 1);

                // 재귀 호출이 끝나고 돌아오면,
                // 다음 탐색을 위해 현재 숫자를 false 로돌림
                //    예: [1, 2] 탐색 후 돌아오면 visited[2]를 false로 만들어야 [1, 3]을 탐색 가능
                visit[i] = false;
            }
        }
    }
}