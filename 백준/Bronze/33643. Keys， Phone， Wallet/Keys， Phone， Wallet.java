import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        boolean keys =true;
        boolean phone =true;
        boolean wallet =true;

        for(int i=0; i<num ;i++){
            String str = br.readLine();

            if(str.equals("keys")){
                keys=false;
            }else if(str.equals("phone")){
                phone=false;
            }else if(str.equals("wallet")){
                wallet=false;
            }
        }
        StringBuilder sb = new StringBuilder();

        if(!keys&&!phone&&!wallet){
            sb.append("ready");
        }else {
            if(keys){
                sb.append("keys\n");
            }
            if(phone){
                sb.append("phone\n");
            }
            if(wallet){
                sb.append("wallet\n");
            }
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}