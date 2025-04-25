import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> answers = sosu(M,N);

        int sum = 0;
        for(int i : answers){
            sum += i;
        }

        if(answers.isEmpty()){
            bw.write("-1");
        }else{
            bw.write(sum+"\n");
            bw.write(answers.get(0)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();


    }
    static List<Integer> sosu(int m, int n){
        boolean[] bool = new boolean[n+1];

        List<Integer> list = new ArrayList<>();

        for(int i=2; i<bool.length; i++){
            bool[i]=true;
        }
        for(int i=2; i<bool.length; i++){
            if(bool[i]){
                for(int j = i*i; j<bool.length; j+=i){
                    bool[j]=false;
                }
            }
        }
        for(int i=2; i<bool.length; i++){
            if(bool[i] && i>=m && i <= n){
                list.add(i);
            }
        }
        return list;
    }
}