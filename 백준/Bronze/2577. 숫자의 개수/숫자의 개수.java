import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int num = A*B*C;

        int[] answer = new int[10];

        while(num > 0) {

            int index = num%10;
            answer[index]++;
            num = num/10;
        }

        for(int i = 0; i < 10; i++) {
            bw.write(answer[i] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();



    }
}