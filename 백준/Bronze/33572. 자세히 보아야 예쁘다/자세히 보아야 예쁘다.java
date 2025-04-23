import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long sum =0;

        for(int i=0; i<N ; i++){
            sum+=Long.parseLong(st.nextToken())-1;
        }

        if(sum < M){
            bw.write("OUT");
        }else{
            bw.write("DIMI");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}