import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
                            //int[] 타입 인자들임
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {// x좌표가 같으면
                return a[1] - b[1]; // y좌표 비교 음수 반환시 a가 앞에 양수면 b가 앞
        } else {
            return a[0] - b[0]; // x좌표 비교
        }
    });

        for (int i = 0; i < n; i++) {
        output.write(arr[i][0] + " " + arr[i][1] + "\n");
    }

        output.flush();
        output.close();
        input.close();
}
}