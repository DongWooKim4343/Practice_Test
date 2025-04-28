import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] arrX = new int[num];
        int[] arrY = new int[num];

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrX[i]= Integer.parseInt(st.nextToken());
            minX = Math.min(minX, arrX[i]);
            maxX = Math.max(maxX, arrX[i]);

            arrY[i]= Integer.parseInt(st.nextToken());
            minY = Math.min(minY, arrY[i]);
            maxY = Math.max(maxY, arrY[i]);
        }

        int answer= (maxX-minX) * (maxY-minY);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();



    }
}