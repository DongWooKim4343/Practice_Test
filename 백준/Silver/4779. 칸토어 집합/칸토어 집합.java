import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String str;

        while((str=br.readLine())!=null){
            int num = Integer.parseInt(str);

            sb.append(cantor(num)).append("\n");
       }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    static String cantor(int n){
        if(n==0){
            return "-";
        }
        String prev = cantor(n-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<prev.length(); i++){
            sb.append(" ");
        }
        return prev + sb.toString() + prev;
    }

}