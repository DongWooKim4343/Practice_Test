import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb =new StringBuilder();
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long lcm = getLcm(b, a);
            sb.append(lcm).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }

    public static long getGcd(long a, long b){
        if(b==0){
            return a;
        }
        return getGcd(b, a%b);
    }

    public static long getLcm(long a, long b){

        long div = getGcd(Math.max(a,b), Math.min(a,b));
        return (a/div)*b;
    }
}