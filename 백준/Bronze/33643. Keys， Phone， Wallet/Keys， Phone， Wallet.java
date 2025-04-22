import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        list.add("keys");
        list.add("phone");
        list.add("wallet");

        for(int i=0; i<num; i++){
            list.remove(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        if(list.isEmpty()){
            sb.append("ready");
        }else{
            for(String s : list){
                sb.append(s).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}