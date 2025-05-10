import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int gcd = getGcd(a, b);
            
            if (c > Math.max(a, b)) {
                sb.append("NO").append("\n");
            } else {
                if (c % gcd == 0) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }
            }

        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
    static int getGcd(int a, int b){
        if(b==0){
            return a;
        }
        return getGcd(b, a%b);
    }
}