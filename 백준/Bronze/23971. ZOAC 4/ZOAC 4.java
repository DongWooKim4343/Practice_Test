import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken()); //H행
        int W = Integer.parseInt(st.nextToken()); //W개
        int N = Integer.parseInt(st.nextToken()); //세로줄 번호차거 N보다 크거나
        int M = Integer.parseInt(st.nextToken()); //가로줄 번호차가 M보다 커야함

        int row = (H-1) / (N+1)+1;
        int col = (W-1) / (M+1)+1;

        int answer = row*col;

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
}