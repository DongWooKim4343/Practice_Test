import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(input.readLine()); // 첫 줄 읽기
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(input.readLine());

        for (int t = 0; t < N; t++) {
            arr[t] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0 ; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                    if (count == K) {
                        output.write(String.valueOf(arr[j] + " " + arr[j+1]));
                        output.flush();
                        return;
                    }
                }
                //System.out.println(Arrays.toString(arr));

            }
        }
        //System.out.println(count+" "+K);
        if (count < K) {
            output.write(String.valueOf("-1"));
            output.flush();
        }
    }
}
