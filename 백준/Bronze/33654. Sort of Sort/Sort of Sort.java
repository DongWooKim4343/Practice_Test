import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        
        list.add(num);
        for (int i = 0; i < N-1; i++) {
            int num2 = Integer.parseInt(st.nextToken());
            if(num <= num2) {
                list.add(num2);
            }
            
            num = Math.max(num2,num);

        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]+" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}