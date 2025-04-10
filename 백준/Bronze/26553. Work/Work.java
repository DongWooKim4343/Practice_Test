import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());


            double K = (double) k;
            double P = (double) p;
            double X = (double) x;

            double minTotalCost = Double.MAX_VALUE;

            for (int M = 1; M <= 10001; M++) {
                double temp = (double)M * X + K * P / (double)M;

                minTotalCost = Math.min(minTotalCost, temp);

            }

            bw.write(String.format("%.3f", minTotalCost));
            bw.newLine(); 
        }

        bw.flush();
        bw.close();
        br.close();
    }
}