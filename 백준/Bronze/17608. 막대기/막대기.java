import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(input.readLine());
        int count =1;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<N; i++){
            stack.add(Integer.parseInt(input.readLine()));
        }
        int firstNum = stack.pop();

        for(int i=0; i<N-1; i++){

            int num=stack.pop();

            if(firstNum<num){
                count++;
                firstNum=num;
            }

        }
        output.write(String.valueOf(count));
        output.flush();
        output.close();



    }
}