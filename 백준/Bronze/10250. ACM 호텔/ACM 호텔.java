import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int floor=0;
        int roomNum=0;
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); //층수
            int W = Integer.parseInt(st.nextToken()); //층당 방
            int N = Integer.parseInt(st.nextToken()); //몇번째 손님

            if (N % H == 0) {
                floor = H;
                roomNum = N / H;
            } else {
                floor = N % H;
                roomNum = N / H + 1;
            }

            int result = floor*100 + roomNum;
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
        br.close();


    }
}