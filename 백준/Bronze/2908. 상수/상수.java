import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] agrs) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(input.readLine()," ");

        String num1 =st.nextToken();
        String num2 =st.nextToken();

        StringBuilder sb= new StringBuilder();
        int number1 = Integer.parseInt(sb.append(num1).reverse().toString());
        sb= new StringBuilder();
        int number2 = Integer.parseInt(sb.append(num2).reverse().toString());

        if(number1>number2){
            output.write(Integer.toString(number1));
            output.flush();
        }else{
            output.write(Integer.toString(number2));
            output.flush();
        }

    }
}