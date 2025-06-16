import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int ooo = 0;
        int xxx = 0;
        int nnn = 0;

        for(int i = 0; i < N; i++){
            int vote = Integer.parseInt(st.nextToken());
            if(vote == 1){
                ooo++;
            }else if(vote == -1){
                xxx++;
            }else{
                nnn++;
            }
        }

        
        if (nnn * 2 >= N) {
            bw.write("INVALID");
        }
        else if (ooo > xxx) {
            bw.write("APPROVED");
        }
        else {
            bw.write("REJECTED");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}