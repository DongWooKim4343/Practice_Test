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

        int num1 = Integer.parseInt(input.readLine());

        int[] numArr =  new int [num1];

        StringTokenizer st = new StringTokenizer(input.readLine()," ");
        for(int i=0;i<num1;i++){
            numArr[i]=Integer.parseInt(st.nextToken());
        }
        int minNum=numArr[0];
        int maxNum=numArr[0];
        for(int i=0;i<numArr.length;i++){
            if(maxNum<numArr[i]){
                maxNum=numArr[i];
            }
            if(minNum>numArr[i]){
                minNum=numArr[i];

            }
        }
        output.write(String.valueOf(minNum+" "+maxNum));
        output.flush();
    }
}