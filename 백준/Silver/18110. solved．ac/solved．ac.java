import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int nnn = (int)Math.round(n*0.15) ;

        int sum=0;
        for(int i = nnn; i < n-nnn; i++){
            sum+=list.get(i);
        }
        int answer = (int) Math.round((double)sum/(n-nnn-nnn));

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}