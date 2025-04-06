import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] digital = {"social", "history", "language", "literacy"};
        String[] bigData ={"bigdata", "public", "society"};

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            for (int i = 0; i < digital.length; i++) {
                if (word.equals(digital[i])) {
                    bw.write("digital humanities");
                }
            }
            for (int i = 0; i < bigData.length; i++) {
                if (bigData[i].equals(word)) {
                    bw.write("public bigdata");
                }
            }
        }



        bw.flush();
        br.close();
        bw.close();

    }
}