import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        if(arr[2] >= arr[1]+arr[0]){
            arr[2] = arr[1]+arr[0]-1;
        }
        int sum = arr[0]+arr[1]+arr[2];

        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();


    }
}