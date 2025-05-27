import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String left = st.nextToken();
            String right = st.nextToken();

            if(set.contains(left) || set.contains(right)){
                set.add(left);
                set.add(right);
            }
        }

        bw.write(set.size()+"");
        bw.flush();
        bw.close();
        br.close();

    }
}