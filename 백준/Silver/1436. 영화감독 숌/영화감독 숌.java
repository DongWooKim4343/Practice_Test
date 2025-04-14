import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int breaker = 0;
        String s = "666";
        while (true) {

            if (num == 0) {
                s = "0";
                break;
            }

            if (s.contains("666")) {
                breaker++;
            }

            int sixx = Integer.parseInt(s);
            if (num == breaker) {
                break;
            }
            sixx++;
            s = String.valueOf(sixx);



        }

        bw.write(String.valueOf(s));
        bw.flush();
        bw.close();
        br.close();

    }
}