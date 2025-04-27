import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int N= Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        if(N==1){
            return;
        }

        int index = 2;

        while(N>1) {
            if (N % index == 0) {
                list.add(index);
                N /= index;

            }else{
                index++;
            }
        }
    
        for(Integer s : list){
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}