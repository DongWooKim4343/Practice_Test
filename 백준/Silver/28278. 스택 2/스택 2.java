import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb =new StringBuilder();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            if(order==1){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(order==2){
                if(stack.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(stack.pop()).append("\n");
                }
            }else if(order==3){
                sb.append(stack.size()).append("\n");
            }else if(order==4){
                if(stack.isEmpty()){
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
            }else if(order==5){
                if(!stack.isEmpty()){
                    sb.append(stack.peek()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}