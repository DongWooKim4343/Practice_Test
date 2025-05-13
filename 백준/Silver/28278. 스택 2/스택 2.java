import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        StringBuilder sb =new StringBuilder();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            if(order==1){
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
            }else if(order==2){
                if(list.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(list.get(list.size()-1)).append("\n");
                    list.remove(list.size()-1);
                }
            }else if(order==3){
                sb.append(list.size()).append("\n");
            }else if(order==4){
                if(list.isEmpty()){
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
            }else if(order==5){
                if(!list.isEmpty()){
                    sb.append(list.get(list.size()-1)).append("\n");
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