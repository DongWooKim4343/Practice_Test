import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];


        boolean isSeven = false;
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            isSeven = false;
            for(int j = 0; j < n; j++){
                numbers[j] = Integer.parseInt(st.nextToken());
                if (numbers[j] ==7) {
                    isSeven = true;
                    break;
                }
            }
        }

        if(isSeven){
            bw.write("777");
        }else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}