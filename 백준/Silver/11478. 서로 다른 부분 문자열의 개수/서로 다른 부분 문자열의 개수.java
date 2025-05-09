import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        Set<String> set = new HashSet<>();

        for(int i=0; i<=S.length(); i++){
            for(int j=i+1; j<=S.length(); j++){
                set.add(S.substring(i,j));
            }
        }

        int answer = set.size();
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }
}