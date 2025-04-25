import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String el = st.nextToken();

            map.put(name, el);
            map.remove(name, "leave");
        }
        StringBuilder sb = new StringBuilder();

        Set<String> set = map.keySet();

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for(String s : list){
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}