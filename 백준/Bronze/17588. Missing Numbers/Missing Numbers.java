import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            max = Math.max(max,num);
        }
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<=max;i++){
            if(!list.contains(i)){
                answer.add(i);
            }
        }

        Collections.sort(answer);
        if(answer.isEmpty()){
            bw.write("good job");
        }else {
            for(int i : answer){
                bw.write(i+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }

}