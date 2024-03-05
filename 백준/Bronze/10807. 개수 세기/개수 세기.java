import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int countNum = Integer.parseInt(input.readLine());
        int[] numArr = new int[countNum];
        int check=0;
        StringTokenizer st = new StringTokenizer(input.readLine()," ");

        for(int i=0;i<countNum;i++){

            int num = Integer.parseInt(st.nextToken());
            numArr[i]= num;

        }

        int checkNum= Integer.parseInt(input.readLine());
        for(int i =0; i<countNum;i++){
            if(numArr[i]==checkNum){
                check+=1;
            }
        }
        output.write(check+"\n");
        output.flush();
    }
}