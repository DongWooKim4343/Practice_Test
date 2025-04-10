import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int mount = Integer.parseInt(st.nextToken());



        int[] arr = new int[count];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i=0; i<count; i++){
            for(int j=i+1; j<count; j++){
                for(int k=j+1; k<count; k++){
                    int temp = arr[i]+arr[j]+arr[k];
                    if(temp <= mount){
                        if(temp >= answer){
                            answer = temp;
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }
}