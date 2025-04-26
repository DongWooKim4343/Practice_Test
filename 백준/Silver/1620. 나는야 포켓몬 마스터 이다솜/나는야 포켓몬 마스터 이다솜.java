import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //도감에 수록된 포켓몬의 개수
        int M = Integer.parseInt(st.nextToken()); //맞춰야하는 문제의 개수

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("0");

        for(int i=1 ; i<= N; i++){
            String ss = br.readLine();
            map.put(ss,i);
            list.add(i, ss);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1 ; i<=M; i++){
            String sss = br.readLine();

            try{
                int nn=Integer.parseInt(sss);
                sb.append(list.get(nn)).append("\n");
            }catch(Exception e){
                sb.append(map.get(sss)).append("\n");
            }

        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();


    }
}