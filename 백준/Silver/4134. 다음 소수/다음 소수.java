import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            long n = Long.parseLong(br.readLine());
            long answer = prime(n);
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static long prime(long a){
        if(a <= 2) return 2;

        while(true){
            boolean bool = true;
            for(long i=2; i*i <= a; i++){
                if(a%i == 0){
                    bool =false;
                    break;
                }
            }
            if(bool){
                return a;
            }
            a++;
       }
    }
}