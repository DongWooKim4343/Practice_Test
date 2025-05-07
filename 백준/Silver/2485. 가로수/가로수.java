import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        int gcd = list.get(1)-list.get(0);
        for(int i=1; i<list.size(); i++){
            int n = list.get(i)-list.get(i-1);
            gcd = getGcd(gcd, n);
        }

        int addSize = (list.get(N-1)/gcd)-(list.get(0)/gcd); ;

        int answer = addSize-list.size()+1;

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }

    static int getGcd(int a, int b){
        if(b==0){
            return a;
        }
        return getGcd(b, a%b);
    }
}