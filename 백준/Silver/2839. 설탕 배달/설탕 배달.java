import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int five = 0;
        int three = 0;
        int answer = 0;
        
        out:
        for(int i=0; i<5001; i+=3){
            for(int j=0; j<5001; j+=5){
                if(num == (i+j)){
                    five =j;
                    three=i;
                    break out;
                }
            }
        }
        
        if(five ==0 && three==0){
            bw.write(String.valueOf(-1));
        }else{
            answer = (five/5)+(three/3);
            bw.write(String.valueOf(answer));
        }
        
        bw.flush();
        br.close();
        bw.close();
        
        
        
    }
}