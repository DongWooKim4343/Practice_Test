import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));


        int num = Integer.parseInt(input.readLine());
        input.close();

        for(int i=1; i<num; i++){
            for(int j=num; j>i; j--){
                output.write(" ");
            }
            for(int k=0; k<i*2-1; k++){
                output.write("*");
            }
            output.newLine();
        }
        for(int i=num; i>=1; i--){
            for(int j=num; j>i; j--){
                output.write(" ");
            }
            for(int k=0; k<i*2-1; k++){
                output.write("*");
            }
            output.newLine();
        }
        output.flush();
        output.close();



    }



}
