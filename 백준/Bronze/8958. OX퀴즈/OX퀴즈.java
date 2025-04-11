import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String s = br.readLine();
            int answer = 0;
            int n = 1;
            char temp = 'a';
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);

                if(c=='O'){
                    if(temp==c){
                        n++;
                        answer+=n;
                        temp=c;
                    }else{
                        answer++;
                        temp=c;
                    }
                }else if(c=='X'){
                    n=1;
                    temp=c;
                }
            }
            bw.write(answer+"\n");
        }



        bw.flush();
        br.close();
        bw.close();



    }
}