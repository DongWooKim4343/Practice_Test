import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==-1){
                break;
            }

            List<Integer> list = new ArrayList<>();

            int sum = 0;
            for(int i=1; i<n; i++){
                if(n%i ==0){
                    list.add(i);
                    sum +=i;
                }
            }

            StringBuilder sb =new StringBuilder();
            if(n == sum){
                sb.append(n).append(" = ");

                for(int i=0; i<list.size(); i++){
                    sb.append(list.get(i));
                    if(i!=list.size()-1) {
                        sb.append(" + ");
                    }
                }
            }else{
                sb.append(n).append(" is NOT perfect.");
            }
            bw.write(sb.toString()+"\n");

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
