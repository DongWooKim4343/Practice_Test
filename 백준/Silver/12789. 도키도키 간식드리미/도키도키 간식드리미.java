import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> stack = new Stack<>();

        int target = 1;

        while(target <= N){
            if(!queue.isEmpty() && queue.peek()==target){
                queue.poll();
                target++;
            }else if(!stack.isEmpty() && stack.peek()==target){
                stack.pop();
                target++;
            }else if(!queue.isEmpty()){
                stack.push(queue.poll());
            }else{
                break;
            }

        }
        if(target > N){
            bw.write("Nice");
        }else{
            bw.write("Sad");
        }

        bw.flush();
        bw.close();
        br.close();


    }
}