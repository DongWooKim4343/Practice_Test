import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> turn = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            deque.offer(Integer.parseInt(st.nextToken()));
            turn.offer(i);
        }

        int num = deque.pollFirst();
        sb.append(turn.pollFirst()).append(" ");

        while(!deque.isEmpty()){
            if(num>0){
                for(int i=1; i<num; i++){ //맨앞에 있는애 빼고 뒤로 이동한다고 생각
                    deque.offer(deque.pollFirst());
                    turn.offer(turn.pollFirst());
                }
            }else{
                num = Math.abs(num);
                for(int i=1; i<=num; i++){
                    deque.offerFirst(deque.pollLast());
                    turn.offerFirst(turn.pollLast());
                }
            }

            num = deque.pollFirst();
            sb.append(turn.pollFirst()).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();

    }
}