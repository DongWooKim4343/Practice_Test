import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter (new OutputStreamWriter(System.out));
     
        int stairNum = Integer.parseInt(input.readLine());
        int[] arr = new int[stairNum+1]; //처음은 0점으로 처리해야해서 +1
        
        for(int i = 1; i<=stairNum; i++){
            arr[i]=Integer.parseInt(input.readLine());
        }
        int[] scoreArr= new int[stairNum+1];
        
        scoreArr[1] = arr[1];
        if (stairNum >= 2) { // 계단이 2개 이상일 때만 dp[2] 계산
            scoreArr[2] = arr[1] + arr[2];
        }
        if(stairNum >=3 ){
             scoreArr[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);
        }
        
        for(int i = 4; i<scoreArr.length; i++){
            scoreArr[i] = Math.max(arr[i]+arr[i-1]+scoreArr[i-3], scoreArr[i-2]+arr[i]);
        }
        
        output.write(String.valueOf(scoreArr[stairNum]));
        output.flush();
        
    }
}