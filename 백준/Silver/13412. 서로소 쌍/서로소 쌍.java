import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());

            int num=1;
            int count=0;
            while((num*num) <= N){
                if(N%num == 0){
                    if(gcd(num,N/num)==1){
                        count++;
                    }
                }

                num++;
            }
            sb.append(count).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }


}