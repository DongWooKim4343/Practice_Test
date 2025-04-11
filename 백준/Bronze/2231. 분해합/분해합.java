import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int answer = Integer.MAX_VALUE;


        for(int i=1; i<num; i++){
            int tempSum=0;
            int tempCount=i;
            while(tempCount>0){
                tempSum += tempCount%10;
                tempCount /= 10;
            }

            if((tempSum+i)==num){
                answer=Math.min(answer,i);
            }
        }

        if(answer==Integer.MAX_VALUE){
            bw.write("0");
        }else{
            bw.write(answer+"");
        }



        bw.flush();
        br.close();
        bw.close();
    }
}