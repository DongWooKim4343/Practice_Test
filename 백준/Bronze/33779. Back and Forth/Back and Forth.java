import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        boolean breaker = true;
        
        for(int i=0; i<str.length(); i++){
            char c =str.charAt(i);
            char ccc = str.charAt(str.length()-1-i);
            if(c!=ccc){
                breaker =false;
            }
        }

        if(breaker){
            bw.write("beep");
        }else{
            bw.write("boop");
        }



        bw.flush();
        bw.close();
        br.close();
    }
}