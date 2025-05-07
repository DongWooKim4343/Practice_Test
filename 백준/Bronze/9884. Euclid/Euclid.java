import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A  = Integer.parseInt(st.nextToken());
        int B  = Integer.parseInt(st.nextToken());

        int answer = getGcd(A,B);
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }

    static int getGcd(int a, int b){
        if(b==0){
            return a;
        }
        return getGcd(b, a%b);
    }
}