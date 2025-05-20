import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] qOs = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            qOs[i]=Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        //큐인 원소만 저장
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            int value = Integer.parseInt(st2.nextToken());

            if(qOs[i] == 0){
                dq.offerLast(value);

            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine()); // queuestack에 삽입할 원소들
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++){
            int value = Integer.parseInt(st3.nextToken());
            int output;

            if(dq.isEmpty()){
                output = value;
            }else{
                output = dq.pollLast();
                dq.offerFirst(value);
            }
            sb.append(output).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}