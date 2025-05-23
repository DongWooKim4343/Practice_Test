import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(str.equals("push")){
                int num =Integer.parseInt(st.nextToken());
                q.offer(num);
            }else if(str.equals("pop")){
                if(q.isEmpty()){
                    sb.append("-1").append("\n");
                }else {
                    sb.append(q.poll()).append("\n");
                }
            }else if(str.equals("size")){
                sb.append(q.size()).append("\n");
            }else if(str.equals("empty")){
                if(q.isEmpty()){
                    sb.append("1").append("\n");
                }else {
                    sb.append("0").append("\n");
                }
            }else if(str.equals("front")){
                if(q.isEmpty()){
                    sb.append("-1").append("\n");
                }else {
                    sb.append(q.peek()).append("\n");
                }
            }else if(str.equals("back")){
                if(q.isEmpty()){
                    sb.append("-1").append("\n");
                }else {
                    sb.append(q.peekLast()).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}