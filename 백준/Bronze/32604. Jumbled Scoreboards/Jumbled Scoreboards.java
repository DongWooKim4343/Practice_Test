import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] aaa = new int[n];
        int[] bbb = new int[n];


        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            aaa[i] = Integer.parseInt(st.nextToken());
            bbb[i] = Integer.parseInt(st.nextToken());
        }

        boolean isCorrect = true;
        for(int i = 0; i < n-1; i++){
            if (!(aaa[i] <= aaa[i + 1] && bbb[i] <= bbb[i + 1])) {
                isCorrect = false;
                break;
            }
        }
        if(isCorrect){
            bw.write("yes");
        }else {
            bw.write("no");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}