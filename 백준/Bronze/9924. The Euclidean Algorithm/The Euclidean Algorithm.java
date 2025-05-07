import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A  = Integer.parseInt(st.nextToken());
        int B  = Integer.parseInt(st.nextToken());

        int answer = getGcdCount(A,B, 0);
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }

    static int getGcdCount(int a, int b, int count){
        if(b==a){
            return count;
        }

        int aa = Math.max(a,b)-Math.min(a,b);
        int bb = Math.min(a,b);

        count++;
        return getGcdCount(aa, bb, count);
    }
}