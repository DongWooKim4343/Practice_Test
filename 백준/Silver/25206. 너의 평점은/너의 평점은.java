import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5); map.put("A0", 4.0); map.put("B+", 3.5); map.put("B0", 3.0);
        map.put("C+", 2.5); map.put("C0", 2.0); map.put("D+", 1.5); map.put("D0", 1.0);
        map.put("F", 0d);

        double sum = 0;
        double credits = 0;
        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            double cre = Double.parseDouble(st.nextToken());
            String gra = st.nextToken();

            if(!gra.equals("P")) {
                credits += cre;
                sum += map.get(gra) * cre;
            }
        }

        bw.write(sum/credits+"");
        bw.flush();
        br.close();
        bw.close();
    }

}