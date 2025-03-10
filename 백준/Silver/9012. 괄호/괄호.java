import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());
        boolean isValid = true;


        for(int i=0; i<num; i++){
            String str = input.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j=0; j<str.length(); j++){

                if(str.charAt(j)=='('){
                    stack.push(str.charAt(j));
                }else if(str.charAt(j)==')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else {
                        isValid = false;

                    }
                }
            }
            if(isValid&&stack.isEmpty()){
                output.write("YES"+"\n");

            }else {
                output.write("NO"+"\n");

            }
            isValid = true;


        }

        output.flush();

    }
}