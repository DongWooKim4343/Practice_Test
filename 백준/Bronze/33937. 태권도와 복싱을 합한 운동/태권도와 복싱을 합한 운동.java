import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        StringBuilder sb = new StringBuilder();

        int sss = 0;

        for(int i=0; i<str1.length(); i++){
            char c = str1.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                sss=1;
            }else{
                if(sss==1){
                    sb.append(str1.substring(0, i));
                    sss++;
                    break;
                }
            }
        }

        int aaa = 0;
        for(int i=0; i<str2.length(); i++){
            char c = str2.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                aaa=1;
            }else{
                if(aaa==1){
                    sb.append(str2.substring(0, i));
                    aaa++;
                    break;
                }
            }
        }

        if(aaa==2&&sss==2){
            bw.write(sb.toString());
        }else{
            bw.write("no such exercise");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}