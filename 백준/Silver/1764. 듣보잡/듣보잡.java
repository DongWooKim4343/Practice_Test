import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//듣못수
        int M = Integer.parseInt(st.nextToken());//보못수

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<N+M; i++ ){
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0)+1);
        }


        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int count = 0;
        StringBuilder sb =new StringBuilder();
        for(String s : list){
            if(map.get(s)>=2){
                sb.append(s).append("\n");
                count++;
            }
        }


        bw.write(count+"\n"+sb.toString());
        bw.flush();
        bw.close();
        br.close();




    }
}