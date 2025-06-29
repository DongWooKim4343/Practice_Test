import java.io.*;
import java.util.*;

class Main{
    static int[][][] arr ;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();


        arr = new int[21][21][21];
        arr[0][0][0] = 1;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==-1&&b==-1&&c==-1){
                break;
            }

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(dp(a, b, c)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static int dp(int a, int b, int c){
        if(a <= 0 || b <= 0 || c<=0){
            return 1;
        }
        if(a > 20 || b>20 || c>20){
            return dp(20,20,20);
        }
        if(arr[a][b][c]!=0){
            return arr[a][b][c];
        }

        if(a < b && b < c){
            arr[a][b][c] = dp(a, b, c-1) + dp(a, b-1, c-1) - dp(a, b-1, c);
            return arr[a][b][c];
        }else{
            arr[a][b][c] = dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
            return arr[a][b][c];
        }



    }
}