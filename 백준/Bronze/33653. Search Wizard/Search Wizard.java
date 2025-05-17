import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int number = Integer.parseInt(br.readLine());

        String line = br.readLine();

        int count = 0;
        int index = 0;

        while(true){
            int found = line.indexOf(str, index);
            if(found != -1){
                count++;
                index = found+1;

            }else{
                break;
            }
        }

        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();

    }
}