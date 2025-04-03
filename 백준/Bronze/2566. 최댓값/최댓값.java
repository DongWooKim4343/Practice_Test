import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];
        int max =0;
        int indexI = -1;
        int indexJ = -1;

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] >= max){
                    max = arr[i][j];
                    indexI = i+1;
                    indexJ = j+1;
                }
            }
        }
        bw.write(max+"\n");
        bw.write(indexI+" "+indexJ);
        bw.flush();
        bw.close();
        br.close();



    }

}

 