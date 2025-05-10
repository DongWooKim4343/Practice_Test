import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num%2==0){
                sum += num/2;
            }else {
                sum += num/2+1;
            }

        }

        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();

    }

}