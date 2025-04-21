import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // 라면 계수
            int B = Integer.parseInt(st.nextToken()); // 물
            int X = Integer.parseInt(st.nextToken()); // 끓일 라면 수

            int answer = A * (X - 1) + B;

            bw.write(String.valueOf(answer)+'\n');
        }


        bw.flush();
        bw.close();
        br.close();
    }
}