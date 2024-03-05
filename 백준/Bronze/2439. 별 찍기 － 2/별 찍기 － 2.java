import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(input.readLine());
        input.close();

        for(int i =0;i<count;i++){
            for(int k=count; k-1>i;k--){
                output.write(" ");
            }
            for(int j=0; j<=i;j++) {
                output.write("*");
            }
            output.newLine();
        }
        output.flush();
        output.close();
    }
}