import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter (new OutputStreamWriter(System.out));

        String t;

        while((t=input.readLine())!=null) {
            StringTokenizer st = new StringTokenizer(t);

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            output.write((num1 + num2)+ "\n");



        }
        output.flush();
    }
}