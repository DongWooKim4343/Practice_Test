import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());

            if(num==1){
                int x = Integer.parseInt(st.nextToken());
                deque.offerFirst(x);
            }else if(num==2){
                int x = Integer.parseInt(st.nextToken());
                deque.offerLast(x);
            }else if(num==3){
                if(!deque.isEmpty()){
                    sb.append(deque.pollFirst()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }else if(num==4){
                if(!deque.isEmpty()){
                    sb.append(deque.pollLast()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }else if(num==5){
                sb.append(deque.size()).append("\n");
            }else if(num==6){
                if(deque.isEmpty()){
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
            }else if(num==7){
                if(!deque.isEmpty()){
                    sb.append(deque.peekFirst()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }else if(num==8){
                if(!deque.isEmpty()){
                    sb.append(deque.peekLast()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
}