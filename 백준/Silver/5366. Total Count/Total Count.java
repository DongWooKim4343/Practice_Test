import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new LinkedHashMap<>();

        while(true){
            String s = br.readLine();
            if(s.equals("0")) break;

            map.put(s, map.getOrDefault(s, 0) + 1);

        }
        int sum =0;
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            sum += entry.getValue();
        }
        sb.append("Grand Total: ").append(sum).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }
}