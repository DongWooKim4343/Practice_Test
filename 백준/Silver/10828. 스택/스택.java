import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if(order.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(order.equals("pop")){
                if(!stack.isEmpty()){
                    sb.append(stack.pop()).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }else if(order.equals("size")){
                sb.append(stack.size()).append("\n");
            }else if(order.equals("empty")){
                if(!stack.isEmpty()){
                    sb.append("0").append("\n");
                }else{
                    sb.append("1").append("\n");
                }
            }else if(order.equals("top")){
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