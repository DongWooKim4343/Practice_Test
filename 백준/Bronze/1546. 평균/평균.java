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

        int subjectNum = Integer.parseInt(input.readLine());
        int[] numArr=new int[subjectNum];


        StringTokenizer st = new StringTokenizer(input.readLine()," ");
        for(int i=0; i<numArr.length;i++){
            numArr[i]=Integer.parseInt(st.nextToken());
        }
        int sum=0;
        for(int i=0; i<numArr.length;i++){
            sum=sum+numArr[i];
        }
        float maxNum=numArr[0];
        for(int i =1 ;i<numArr.length;i++){
            if(maxNum<numArr[i]){
                maxNum=numArr[i];
            }
        }


        float nSum=0;
        for(int i=0; i<numArr.length;i++){
            float newVal=(numArr[i]/maxNum)*100;
            nSum=newVal+nSum;
        }
        output.write(Float.toString( nSum/numArr.length));
        output.flush();


    }
}