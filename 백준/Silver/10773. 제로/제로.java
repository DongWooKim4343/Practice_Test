import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack();

        for(int i=0; i<K; i++){

            int num = Integer.parseInt(br.readLine());

            if(num==0){
                stack.pop();
            }else{
                stack.push(num);
            }

        }
        int sum = 0;
        for(int n : stack){
            sum+=n;
        }

        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();

    }
}