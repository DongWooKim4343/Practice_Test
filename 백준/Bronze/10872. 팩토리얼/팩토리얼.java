import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 1;

        for(int i=0; i<N; i++){
            answer *= N-i;
        }

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}