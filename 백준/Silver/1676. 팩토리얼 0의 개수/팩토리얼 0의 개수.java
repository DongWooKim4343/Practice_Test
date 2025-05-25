import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=1; i<5 ; i++){
            answer += N/(int)(Math.pow(5,i));
        }

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}

















