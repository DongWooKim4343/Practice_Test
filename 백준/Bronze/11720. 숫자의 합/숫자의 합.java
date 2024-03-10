import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter (new OutputStreamWriter(System.out));
        
        int sum=0;
        int countNum = Integer.parseInt(input.readLine());
        String[] numArr = (input.readLine()).split("");
        
        for(int i =0; i<countNum; i++){
            sum= Integer.parseInt(numArr[i])+sum;
        }
        output.write(Integer.toString(sum));
        output.flush();
         
        
    }
}