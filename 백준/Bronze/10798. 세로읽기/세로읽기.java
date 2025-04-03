import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] arr = new char[5][15];

        for(int i=0; i<arr.length; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<arr[1].length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j][i] != '\0') {
                    bw.write(arr[j][i]);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();




    }
}