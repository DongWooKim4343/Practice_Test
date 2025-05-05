import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long aa = a/gcd(a,b); //첫번째 입력 기약분수 만들기
        long bb = b/gcd(a,b);

        st = new StringTokenizer(br.readLine());
        long aaa = Long.parseLong(st.nextToken());
        long bbb = Long.parseLong(st.nextToken());

        long aaaa = aaa/gcd(aaa,bbb); //두번째 입력 기약분수 만들기
        long bbbb = bbb/gcd(aaa,bbb);

        long son = (aaaa*bb)+(bbbb*aa);
        long mom = bbbb*bb;


        long answerNu = son/gcd(son,mom);
        long answerDe = mom/gcd(son,mom);

        bw.write(answerNu+" "+answerDe);
        bw.flush();
        bw.close();
        br.close();
    }
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}