
import java.io.*;
import java.math.BigInteger; 
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger n = new BigInteger(st.nextToken()); // 가진 돈 n
        BigInteger m = new BigInteger(st.nextToken()); // 생명체의 수 m

        // BigInteger의 나눗셈과 나머지 연산
        BigInteger[] result = n.divideAndRemainder(m);

        BigInteger quotient = result[0]; 
        BigInteger remainder = result[1]; 

        
        bw.write(quotient+"\n");
        bw.write(remainder+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}