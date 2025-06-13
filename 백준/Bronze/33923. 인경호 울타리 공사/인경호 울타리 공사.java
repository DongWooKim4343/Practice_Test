import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long answer;

        if (N == M) {
            answer = (N - 2) * (N - 2) + 1;
        }
        else {
            long min = Math.min(N, M);
            answer = (min - 1) * (min - 1);
        }

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
}