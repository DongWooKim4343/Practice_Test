import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int max = Math.max(x, y);
        int min = Math.min(x, y);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i< max; i++){
            if(min-- >0){
                sb2.append(2);
            }else{
                sb1.append(1);
            }
        }

        sb1.append(sb2);



        bw.write(sb1.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
















