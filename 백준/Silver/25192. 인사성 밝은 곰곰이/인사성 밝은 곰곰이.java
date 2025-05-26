import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        int count = 0;

        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                count+= set.size();
                set.clear();
            }else{
                set.add(str);
            }
        }
        count+= set.size();

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}