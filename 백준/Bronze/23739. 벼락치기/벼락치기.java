import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int remain = 0;
        int time = 30;
        int count = 0;

        for (int i=0; i<n ; i++){
            int chapter = Integer.parseInt(br.readLine());
            remain = chapter-time; //-20 0
            time -= chapter; // 20 0

            if(time <= 0){
                if((double) chapter /remain >=2.0 ){
                    count++;
                }
                time = 30;
            }else if(remain <= 0){
                count++;
            }



        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
