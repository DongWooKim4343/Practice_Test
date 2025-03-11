import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String ggg = input.readLine();

        Stack<Character> stack = new Stack<>();
        int count =0;

        for(int i=0; i<ggg.length(); i++){

            if(ggg.charAt(i)=='('){
                stack.push(ggg.charAt(i));
            }else if(ggg.charAt(i)==')'){
                if(!stack.empty()){
                    stack.pop();
                }else{
                    count++;
                }
            }

        }


        output.write(String.valueOf(stack.size()+count));
        output.flush();
    }

}