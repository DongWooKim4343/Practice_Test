import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int budget = Integer.parseInt(br.readLine());
        int watermelon = Integer.parseInt(br.readLine());
        int pomegranates = Integer.parseInt(br.readLine());
        int nuts = Integer.parseInt(br.readLine());

        if(budget >= watermelon){
            bw.write("Watermelon");
        }else if(budget >= pomegranates){
            bw.write("Pomegranates");
        }else if(budget >= nuts){
            bw.write("Nuts");
        }else{
            bw.write("Nothing");
        }

        bw.flush();

    }
}