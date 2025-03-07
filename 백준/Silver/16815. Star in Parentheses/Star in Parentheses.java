import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();
        int starIndex = str.indexOf('*');
        int count = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack.push(i);
            }else if(str.charAt(i)==(')')){
                if(!stack.empty()){
                    int leftIndex = stack.pop();
                    if(leftIndex <starIndex && starIndex < i){
                        count++;
                    }
                }
            }
        }
        
        output.write(String.valueOf(count));
        output.flush();

        input.close();
        output.close();
    }
}
