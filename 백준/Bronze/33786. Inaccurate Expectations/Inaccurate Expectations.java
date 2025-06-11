import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    static BigInteger[] memo;
    public static BigInteger g(int k) {
        // 1. 기저 조건: g(0) = 0
        if (k == 0) {
            return BigInteger.ZERO;
        }

        // 이미 계산된 값이 있다면 바로 반환
        if (memo[k] != null) {
            return memo[k];
        }

        BigInteger bigK = BigInteger.valueOf(k);

        // 재귀 호출: g(k-1)의 결과
        BigInteger prev = g(k - 1);

        // k + k * g(k-1)
        BigInteger result = bigK.add(bigK.multiply(prev));

        memo[k] = result;

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        memo = new BigInteger[n + 1];

        BigInteger result = g(n);

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();


    }
}