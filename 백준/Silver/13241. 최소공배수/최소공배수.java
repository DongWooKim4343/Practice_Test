import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long answer=  lcm(A,B);

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
    static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    static long lcm(long a, long b){
        long div = gcd(a,b);
        return (a/div)*b;
    }
}