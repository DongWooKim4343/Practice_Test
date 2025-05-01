import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        for(int i=0; i<L; i++){
            char c= str.charAt(i);
            int uu = c-96;
            long rP = (long) Math.pow(31,i);
            long hh = uu*rP;
            sum += hh;
        }

        long answer = sum%1234567891;

        bw.write(String.valueOf(answer));
        bw.flush();
        br.close();
        bw.close();

    }
}