import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.equals("0")){
                break;
            }
            boolean bbb = true;
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                char oo = str.charAt(str.length()-1-i);
                if(c!=oo){
                    sb.append("no").append("\n");
                    bbb=false;
                    break;
                }
            }

            if(bbb){
                sb.append("yes").append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}