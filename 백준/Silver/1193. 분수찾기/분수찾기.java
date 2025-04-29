import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int kk = 0; //대각선 번호
        int kSum = 0; //분수 개수

        while(kSum < n){
            kk++;
            kSum+= kk;
        }

        int prevCount = kSum - kk;

        // kk번째 라인에서의 순서
        int order = n - prevCount;

        int numerator;   // 분자
        int denominator; // 분모


        if (kk % 2 == 0) {
            numerator = order;
            denominator = kk - order + 1;
        } else {
            numerator = kk - order + 1;
            denominator = order;
        }



        bw.write(numerator + "/" + denominator);
        bw.flush();
        bw.close();
        br.close();



    }
}