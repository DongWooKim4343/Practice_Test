import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char target = st.nextToken().charAt(0);
        String[] targetArr = new String[N+1];
        int answer = 0;

        for(int i=1; i<=N; i++){
            targetArr[i] = String.valueOf(i);
        }

        for(int i=1; i<=N; i++){
            String s = targetArr[i];
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(c==target){
                    answer++;
                }
            }
        }

        bw.write(answer+"");
        bw.flush();
        br.close();
        bw.close();

    }
}