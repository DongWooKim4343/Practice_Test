import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String words= br.readLine();

        String[] digital = {"social", "history", "language", "literacy"};
        String[] bigData ={"bigdata", "public", "society"};

        for(int i=0; i< digital.length; i++){
            if(words.contains(digital[i])){
                bw.write("digital humanities");
                break;
            }
        }
        for(int i=0; i< bigData.length; i++){
            if(words.contains(bigData[i])){
                bw.write("public bigdata");
                break;
            }
        }



        bw.flush();
        br.close();
        bw.close();

    }
}