import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aa = Integer.parseInt(st.nextToken());
        int bb = Integer.parseInt(st.nextToken());

        int ccc = Integer.parseInt(br.readLine());

        int nnn = Integer.parseInt(br.readLine());

        boolean isTrue = true;

        for(int i = nnn; i <= 100; i++){
            int fn = aa *i + bb;
            int gn = ccc* i;
            if (!(fn <= gn)) {
                isTrue = false;
                break;
            }
        }

        if (isTrue){
            bw.write("1");
        }else {
            bw.write("0");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}