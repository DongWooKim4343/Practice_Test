import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());
        StringTokenizer st = new StringTokenizer(input.readLine());
        StringTokenizer st2 = new StringTokenizer(input.readLine());

        Integer[] arrA = new Integer[num];
        Integer[] arrB = new Integer[num];

        for(int i=0; i<num; i++){
            arrA[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<num; i++){
            arrB[i]=Integer.parseInt(st2.nextToken());
        }
        int answer=0;

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        for(int i=0; i<arrA.length; i++){
            answer+=arrA[i]*arrB[i];
        }
        output.write(String.valueOf(answer));
        output.flush();



    }
}