import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long gcd = getGcd(A, B);

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<gcd; i++){
            sb.append('1');
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
    static long getGcd(long a, long b){
        if(b==0){
            return a;
        }
        return getGcd(b, a%b);
    }
}