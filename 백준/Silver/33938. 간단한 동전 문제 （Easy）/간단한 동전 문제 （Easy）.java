import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if (N == 0) {
            if (M == 0) {
                bw.write("0\n");
            } else {
                bw.write("-1\n");
            }
            bw.flush();
            br.close();
            bw.close();
            return;
        }

        if (M == 0) {
            bw.write("0\n");
            bw.flush();
            br.close();
            bw.close();
            return;
        }
        
        List<Integer> coins = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coins.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(coins); 

        long count = -1; // 최종 결과 저장 변수, 초기값 -1
        
        if (N == 1) {
            int cc = coins.get(0); // 동전의 가치
            if (cc == 0) {
                // count -1 유지
            } else {
                if (M % cc == 0) { // M이 cc로 나누어 떨어지는 경우
                    long need = (long)M / cc;
                    if (need >= 0) { // 동전 개수는 음수일 수 없음
                        count = need;
                    }
                    // num_coins_needed < 0 이면 count는 -1 유지
                }
            }
        }
        
        else if (N == 2) {
            int a = coins.get(0); 
            int b = coins.get(1); 

            long minSum = Long.MAX_VALUE; // N=2 경우의 최소 동전 합
            
            int limit = 3001; 

            for (long x = 0; x < limit; x++) { // x는 a 동전의 개수
                long valueA = x * a;
                long remain = (long)M - valueA; // b 동전으로 만들어야 할 금액

                // b 동전으로 remain을 만드는 경우
                if (b == 0) { // 두 번째 동전이 0원짜리인 경우
                    if (remain == 0) {
                        // 남은 금액이 0이면, 0원짜리 동전 0개 사용이 최적
                        long y = 0;
                        if (minSum > x + y) {
                            minSum = x + y;
                        }
                    }
                    // remain이 0이 아니면 0원짜리 동전 b로는 만들 수 없음
                } else { // 두 번째 동전 b가 0원짜리가 아닌 경우
                    if (remain % b == 0) { // remain이 b로 나누어 떨어져야 함
                        long y = remain / b; // 필요한 b 동전의 개수
                        if (y >= 0) { // b 동전의 개수도 음수일 수 없음
                            if (minSum > x + y) {
                                minSum = x + y;
                            }
                        }
                    }
                }
            }

            if (minSum != Long.MAX_VALUE) {
                count = minSum;
            }

        }

        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}