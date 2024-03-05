import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(input.readLine()," ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int[] numArr =  new int [num1];

        StringTokenizer st2 = new StringTokenizer(input.readLine()," ");
        for(int i=0;i<num1;i++){
            numArr[i]=Integer.parseInt(st2.nextToken());
        }
        for(int nums : numArr){
            if(nums<num2){
                output.write(String.valueOf(nums)+" ");
                output.flush();
            }
        }

    }
}