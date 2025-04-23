import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] xxx = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            xxx[i]=Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<N; i++){
            set.add(xxx[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<list.size(); i++){
            map.put(list.get(i), i);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            sb.append(map.get(xxx[i])).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}