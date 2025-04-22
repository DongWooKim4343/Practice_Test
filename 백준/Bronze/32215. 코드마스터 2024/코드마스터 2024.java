import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //n대의 컴퓨터
        int m = Integer.parseInt(st.nextToken()); //m개씩 에디터 설치
        int k = Integer.parseInt(st.nextToken()); //k개의 컴퓨터에 m개 설치함

        int sum = 0;

        sum += (m*k)+m;
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}