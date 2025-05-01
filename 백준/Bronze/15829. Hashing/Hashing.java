import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int M = 1234567891;

        long rP = 1;
        long sum = 0;
        for(int i=0; i<L; i++){
            char c= str.charAt(i);
            int uu = c-96;
            long hh = (uu*rP)%M;
            sum = (sum+hh) %M;
            rP = (rP*31)%M;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();

    }
}