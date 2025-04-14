import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//참가자수
        int jimin = Integer.parseInt(st.nextToken());// 김지민 번호
        int hansu = Integer.parseInt(st.nextToken());// 임한수 번호
        int answer = 0;

        while(jimin!=hansu){
            if(jimin>0){
                if(jimin%2==1){
                    jimin++;
                    jimin /=2;
                }else{
                    jimin /=2;
                }

            }
            if(hansu>0){
                if(hansu%2==1){
                    hansu++;
                    hansu /=2;
                }else{
                    hansu /=2;
                }
            }

            if(N%2 ==0){
                N++;
                N /=2;
            }else {
                N /=2;
            }

            answer++;

            if(N==0 && jimin!=hansu){
                answer =-1;
                break;
            }
        }

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}