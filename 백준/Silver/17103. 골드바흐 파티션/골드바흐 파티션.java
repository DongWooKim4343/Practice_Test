import java.util.*;
import java.io.*;

class Main{
    static boolean[] bool = new boolean[1000001];
    static void prime (){
        Arrays.fill(bool,true);
        bool[0]=false;
        bool[1]=false;

        for(int i=2; i*i< bool.length; i++) {
            if (bool[i]) {
                for (int j = i * i; j < bool.length; j += i) {
                    bool[j] = false;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        prime();

        for(int i =0; i<T; i++){
            int num = Integer.parseInt(br.readLine());
            int count = 0;

            for(int j = 2; j <= num-j; j++){
                if(bool[j]){
                    int k = num-j;
                    if(bool[k]){
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}