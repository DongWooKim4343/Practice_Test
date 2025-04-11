import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] arr = new int[3];
            
            for(int i = 0; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr);
            
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if(a==0 && b==0 && c==0){
                break;
            }

            double ab = Math.sqrt((a*a)+(b*b));
            double cc = Math.sqrt(c*c);


            if(ab==cc){
                bw.write("right\n");
            }else {
                bw.write("wrong\n");
            }


        }
        bw.flush();
        bw.close();
        br.close();
    }
}