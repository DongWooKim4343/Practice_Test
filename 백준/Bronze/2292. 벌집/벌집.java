import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            bw.write("1");
        } else {
            int distance = 1;         
            long cover = 1; // 현재 거리까지 커버하는 최대 방 번호
            long add = 6;     // 다음 거리에 추가될 방의 개수 (거리 2에는 6개)

            // num이 현재 커버된 최대 방 번호보다 클 동안 반복
            while (cover < num) {
                cover += add; // 다음 거리까지 커버하도록 최대 범위 증가
                add += 6;            
                distance++;                
            }
            
            bw.write(distance + "");
        }

        bw.flush();
        bw.close(); 
        br.close();  
    }
}