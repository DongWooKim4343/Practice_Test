import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int answer = 0;

        if((V-A)%(A-B)==0){
            answer = (V-A)/(A-B)+1;
        }else {
            answer = (V-A)/(A-B)+2;
        }



        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}