import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            boolean bbb = sosu(arr[i]);

            if(bbb){
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();




    }
    static boolean sosu(int num){
        boolean[] bool = new boolean[num+1];
        if(num < 2){
            return false;
        }
        for(int i=2; i<bool.length; i++){
            bool[i]=true;
        }
        for(int i=2; i*i<bool.length ; i++){
            if(bool[i]){
                for(int j = i*i; j<bool.length; j+=i){
                    bool[j]=false;
                }
            }
        }
        return bool[num];
    }
}