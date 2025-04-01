import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(input.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(input.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(input.readLine());
        int[] arrM = new int[M];
        st = new StringTokenizer(input.readLine());

        for (int i = 0; i < arrM.length; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }
        int index = 0;
        while (index < M) {
            int low = 0;
            int high = N-1;
            int target = arrM[index];
            boolean trigger = false;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (target > arr[mid]) {
                    low = mid + 1;
                } else if (target < arr[mid]) {
                    high = mid - 1;
                } else if (target == arr[mid]) {
                    trigger = true;
                    break;
                }
            }
            if (trigger) {
                arrM[index++] = 1;
            }else{
                arrM[index++] = 0;
            }

        }

        for (int i = 0; i < arrM.length; i++) {
            output.write(String.valueOf(arrM[i]));
            output.newLine();
        }
        output.flush();


    }
    }