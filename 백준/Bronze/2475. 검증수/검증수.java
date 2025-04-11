import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer =0;

        for(int i=0; i<5; i++){
            int num = Integer.parseInt(st.nextToken());
            answer +=num*num;
        }

        bw.write(answer%10+"");
        bw.flush();
        bw.close();
        br.close();

    }
}