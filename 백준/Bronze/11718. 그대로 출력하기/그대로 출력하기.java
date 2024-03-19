import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


//뭔소리고 그냥 인풋 프린트하면 되는건가

class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String word="";

        while((word = input.readLine())!=null) {

            output.write(word+"\n");
            output.flush();
        }
        input.close();
        output.close();



    }
}