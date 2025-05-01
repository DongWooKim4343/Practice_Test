import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> setC = new HashSet<>(setA);
        for(int nnn : setB){
            setA.remove(nnn);
        }
        for(int nnn : setC){
            setB.remove(nnn);
        }
        int sum = setA.size()+setB.size();

        bw.write(sum+"");
        bw.flush();
        br.close();
        bw.close();

    }
}