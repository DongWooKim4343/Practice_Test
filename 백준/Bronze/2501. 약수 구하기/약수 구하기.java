import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=N ;i++){
            if(N%i ==0){
                list.add(i);
            }
        }

        if(list.size() >= K){
            bw.write(list.get(K-1)+"");
        }else{
            bw.write(0+"");
        }

        bw.flush();
        bw.close();
        br.close();




    }
}