import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = "SciComLove";

        String str = br.readLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            char ccc = s.charAt(i);
            if(ccc != c){
                count++;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }

}