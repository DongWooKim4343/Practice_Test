import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=1; i<=N; i++){
            deque.offer(i);
        }

        List<Integer> list = new ArrayList<>();

        while(deque.size()!=1){

            for(int i=0; i<K-1; i++){
                deque.offer(deque.poll());
            }
            list.add(deque.poll());


        }

        list.add(deque.poll());

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=0; i < list.size(); i++){
            if(i==list.size()-1){
                sb.append(list.get(i)).append(">");
            }else{
                sb.append(list.get(i)).append(", ");
            }

        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}