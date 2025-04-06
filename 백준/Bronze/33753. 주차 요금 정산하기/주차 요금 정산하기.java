import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer =0;

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int T = Integer.parseInt(br.readLine());

        if(T <=30){
            answer +=A;
        }else if(T > 30){
            answer +=A;
            int over = T-30;
            int overFee = (int)Math.ceil((double) over /B);
            answer +=overFee*C;

        }

        bw.write(answer + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}