import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String left = st.nextToken();
            String right = st.nextToken();

            if(left.equals("ChongChong") || right.equals("ChongChong")){
                map.put(left, true);
                map.put(right, true);
            }else if(map.getOrDefault(left, false) || map.getOrDefault(right,false)){
                map.put(left, true);
                map.put(right, true);
            }else{
                map.put(left, map.getOrDefault(left, false));
                map.put(right, map.getOrDefault(right, false));
            }
        }

        Set<Map.Entry<String,Boolean>> entry = map.entrySet();

        int count = 0;
        for(Map.Entry<String,Boolean> pp: entry){
            if(pp.getValue()){
                count++;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}