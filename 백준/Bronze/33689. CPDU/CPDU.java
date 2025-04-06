import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            if(c =='C'){
                answer++;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}