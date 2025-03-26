import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(input.readLine());

        for(int i=0; i<num ; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int answer =0;
        for(int i=0; i<arr.length; i++){

            answer +=(arr[i]*(arr.length-i));
        }

        output.write(String.valueOf(answer));
        output.flush();
        output.close();
        input.close();

    }
}