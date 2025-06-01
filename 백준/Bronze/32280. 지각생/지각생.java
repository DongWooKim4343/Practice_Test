import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 전체 학생 수

        int tArrival = -1;
        List<Integer> list = new ArrayList<>(); // 학생들 도착 시간 리스트

        for (int i = 0; i < n + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String time = st.nextToken();
            String role = st.nextToken();

            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            if (role.equals("teacher")) {
                tArrival = (hours*60)+minutes;
            } else { // role.equals("student")
                list.add((hours*60)+minutes);
            }
        }

        // 정해진 등교 시간 입력
        String schoolTime = br.readLine();
        String[] sct = schoolTime.split(":");
        int schoolMinutes = (Integer.parseInt(sct[0])*60)+Integer.parseInt(sct[1]);

        int count = 0;

        for (int time : list) {
            if(time >= tArrival && time >= schoolMinutes){
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}