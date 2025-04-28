import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int[] arrX = new int[4];
        int[] arrY = new int[4];

        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrX[i] = x;
            arrY[i] = y;
        }

        int answerX = 0;
        int answerY = 0;

        if(arrX[0]==arrX[1]){
            answerX = arrX[2];
        }else if(arrX[1]==arrX[2]){
            answerX = arrX[0];
        }else if(arrX[2]==arrX[0]){
            answerX = arrX[1];
        }
        if(arrY[0]==arrY[1]){
            answerY = arrY[2];
        }else if(arrY[1]==arrY[2]){
            answerY = arrY[0];
        }else if(arrY[2]==arrY[0]){
            answerY = arrY[1];
        }

        bw.write(answerX+" "+answerY+"\n");
        bw.flush();
        bw.close();
        br.close();

    }
}