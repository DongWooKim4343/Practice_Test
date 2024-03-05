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

        int numArr[] = new int[9];

        for(int i =0;i<9;i++){
            int num = Integer.parseInt(input.readLine());
            numArr[i]=num;
        }
        int maxNum=0;
        int numIndex=0;
        for(int i=0;i<numArr.length;i++){
            if(maxNum<numArr[i]) {
                maxNum = numArr[i];
                numIndex =i+1;

            }
        }


        output.write(maxNum+"\n");
        output.write(String.valueOf(numIndex));
        output.flush();
    }
}
