import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }


            if (arr[2] >= arr[0] + arr[1]) {
                bw.write("Invalid\n");
            }
            else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                bw.write("Equilateral\n");
            }

            else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
                bw.write("Isosceles\n");
            }
            else {
                bw.write("Scalene\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();



    }
}