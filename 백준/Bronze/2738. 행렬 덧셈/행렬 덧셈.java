import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(input.readLine());

        int row =Integer.parseInt(st.nextToken());
        int col =Integer.parseInt(st.nextToken());

        int[][] arrA = new int[row][col];
        int[][] arrB = new int[row][col];

        for(int i=0 ; i<row; i++){
            st = new StringTokenizer(input.readLine());
            for(int j=0; j<col; j++){
                arrA[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0 ; i<row; i++){
            st = new StringTokenizer(input.readLine());
            for(int j=0; j<col; j++){
                arrB[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        for(int i=0 ; i<row; i++){
            for(int j=0; j<col; j++){
                arrB[i][j]=arrA[i][j]+arrB[i][j];
                output.write(arrB[i][j]+" ");
            }
            output.newLine();
        }
        output.flush();





    }
}