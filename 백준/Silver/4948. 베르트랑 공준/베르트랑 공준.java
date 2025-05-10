import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num==0) break;

            int answer = prime(num);
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static int prime (int a){
        int aa = 2*a;
        boolean[] bool = new boolean[aa+1];
        Arrays.fill(bool,true);
        bool[0]=false;
        bool[1]=false;

        for(int i=2; i*i<=aa; i++){
            if(bool[i]){
                for(int j= i*i; j<=aa; j+=i){
                    bool[j]=false;
                }
            }
        }
        int count = 0;
        for(int i=a+1 ; i<=aa ; i++){
            if(bool[i]){
                count++;
            }
        }
        return count;
    }
}