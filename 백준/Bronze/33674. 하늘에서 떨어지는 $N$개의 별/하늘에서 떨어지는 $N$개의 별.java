import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

       
        int n = Integer.parseInt(st.nextToken()); 
        int d = Integer.parseInt(st.nextToken());  
        int k = Integer.parseInt(st.nextToken());  

        
        st = new StringTokenizer(br.readLine());
        int max = 0; // 
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());
            
            if (current > max) {
                max = current;
            }
        }
        
        int t_max = k / max; 


        int count = (d - 1) / t_max;

        bw.write(count + "");
        bw.flush();
    }
}