import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N= Integer.parseInt(br.readLine());

        List<Long> listA = new ArrayList<>();
        List<Long> listB = new ArrayList<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken()); // 임시 변수 사용
            long B = Long.parseLong(st.nextToken()); // 임시 변수 사용

            // 입력 분수를 기약분수로 만듦
            long commonDivisor = gcd(A, B);
            long AA = A / commonDivisor;
            long BB = B / commonDivisor;

            listA.add(AA);
            listB.add(BB);
        }


        long gcdA = listA.get(0);
        long lcmB =listB.get(0);


        for(int i=0; i<N; i++){
            gcdA = gcd(gcdA, listA.get(i));

            lcmB = lcm(lcmB, listB.get(i));
        }

        long finalDivisor = gcd(gcdA, lcmB);
        gcdA = gcdA / finalDivisor;
        lcmB = lcmB / finalDivisor;

        bw.write(gcdA + " " + lcmB + "\n");


        bw.flush();
        bw.close();
        br.close();


    }

    static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    static long lcm(long a, long b){
        long div = gcd(a, b);
        return (a/div)*b;
    }
}