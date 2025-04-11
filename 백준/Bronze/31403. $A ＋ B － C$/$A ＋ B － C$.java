import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int answer = A+B-C;
        String str = A+""+B;
        int answer2 = Integer.parseInt(str) - C;

        bw.write(answer+"\n");
        bw.write(answer2+"\n");

        bw.flush();
        br.close();
        bw.close();

    }
}