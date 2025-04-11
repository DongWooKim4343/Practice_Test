import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean ascending = false;
        boolean descending = false;


        int[] arr = new int[9];
        for (int i = 1; i <= 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= 8; i++) {
            if(arr[i] == i) {
                ascending = true;
            }else{
                ascending = false;
                break;
            }
        }
        for (int i = 1; i <= 8; i++) {
            if(arr[i] == 9-i) {
                descending = true;
            }else{
                descending = false;
                break;
            }
        }

        if(ascending) {
            bw.write("ascending");
        }else if(descending) {
            bw.write("descending");
        }else if(!ascending && !descending) {
            bw.write("mixed");
        }






        bw.flush();
        br.close();
        bw.close();



    }
}