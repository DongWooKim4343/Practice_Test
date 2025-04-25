import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int sum = 0;

        while (st.hasMoreTokens()){
            sum+=(Integer.parseInt(st.nextToken())*5);
        }

        bw.write(sum+"");
        bw.flush();
        br.close();
        bw.close();



    }
}