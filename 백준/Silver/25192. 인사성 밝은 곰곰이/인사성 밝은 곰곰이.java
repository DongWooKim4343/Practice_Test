import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String, Boolean> map = new HashMap<>();

        int count = 0;

        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                map.clear();
            }
            map.put(str,map.getOrDefault(str,true));
            if(!str.equals("ENTER") && map.get(str)){
                count++;
                map.put(str,false);
            }

        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}