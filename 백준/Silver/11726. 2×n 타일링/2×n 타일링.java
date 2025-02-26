import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());

        Long[] dp = new Long[num];
        dp[0] = 1L;
        if(num > 1){
            dp[1] = 2L;
        }


        for(int i=2; i<dp.length; i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
        output.write(String.valueOf(dp[num-1]));
        output.flush();

    }
}