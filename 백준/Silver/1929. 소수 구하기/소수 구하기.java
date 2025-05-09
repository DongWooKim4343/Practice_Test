import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        List<Integer> list = prime(M,N);

        StringBuilder sb = new StringBuilder();

        for(Integer n : list){
            sb.append(n).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static List<Integer> prime(int m, int n){
        boolean[] bool = new boolean[n+1];
        List<Integer> list = new ArrayList<>();
        Arrays.fill(bool,true);
        bool[0]=false;
        bool[1]=false;

        for(int i=2; i*i<=n; i++){
            if(bool[i]){
                for(int j=i*i; j<=n ; j+=i){
                    bool[j]=false;
                }
            }
        }
        for(int i= m; i<=n; i++){
            if(bool[i]){
                list.add(i);
            }
        }
        return list;
    }
}