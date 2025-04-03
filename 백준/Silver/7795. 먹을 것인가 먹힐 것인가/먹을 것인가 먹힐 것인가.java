import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //A의 수
            int M = Integer.parseInt(st.nextToken()); //B의 수

            int[] arrA = new int[N];
            StringTokenizer stA = new StringTokenizer(br.readLine());
            for(int k=0; k<N; k++){
                arrA[k]= Integer.parseInt(stA.nextToken());
            }
            Arrays.sort(arrA);

            int[] arrB = new int[M];
            StringTokenizer stB = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                arrB[j]= Integer.parseInt(stB.nextToken());
            }
            Arrays.sort(arrB);

            int answer = 0;
            int index = 0;
            while(index < N) {
                int low = 0;
                int high = M;
                int target = arrA[index++];

                while (low < high) {
                    int mid = low + (high - low) / 2;
                    if (mid < M && target > arrB[mid]) {
                        low = mid + 1;
                    } else {
                        high = mid;
                    }
                }
                answer += low;
            }
            bw.write(answer + "\n");



        }
        bw.flush();
    }
}