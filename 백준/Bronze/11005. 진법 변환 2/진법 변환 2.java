import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder result = new StringBuilder();

        while(n > 0){
            int mod = n%b;
            char charMod ='0';

            if(mod >= 0 && mod <= 9){
                charMod = (char)(mod+'0');
            }else{
                charMod = (char)(mod - 10 + 'A');
            }

            result.append(charMod);
            n = n/b;
        }
        result.reverse();
        bw.write(result.toString());
        bw.flush();




    }
}