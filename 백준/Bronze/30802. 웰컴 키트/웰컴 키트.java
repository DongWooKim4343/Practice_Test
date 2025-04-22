import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<6; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());

        int ttt = Integer.parseInt(st.nextToken());
        int ppp = Integer.parseInt(st.nextToken());

        int tSum=0;
        int pSet=N/ppp;
        int p = N%ppp;

        for(int i=0; i<list.size(); i++){
            int num = list.get(i);
            if(num % ttt==0){
                tSum+=num/ttt;
            }else{
                tSum += (num/ttt)+1;
            }

        }
        bw.write(tSum+"\n");
        bw.write(pSet+" "+p);
        bw.flush();
        bw.close();
        br.close();



    }
}
