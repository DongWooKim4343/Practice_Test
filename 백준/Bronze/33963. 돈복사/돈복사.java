import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int len = String.valueOf(N).length();
        int count = 0;

        int temp = N;

        while(true){
            temp *= 2;
            count++;
            String tt = String.valueOf(temp);
            if(tt.length() > len){
                count--;
                break;
            }
        }

        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();
    }
}