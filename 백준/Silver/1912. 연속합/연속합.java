import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int pre = arr[0];
        int answer = arr[0];
        for(int i=1; i<n; i++){

            pre += arr[i];

            if(pre<=arr[i]){
                pre =arr[i];
            }

            answer = Math.max(pre, answer);
        }


        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }

}