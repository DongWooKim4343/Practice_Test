import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str.charAt(0)=='.') break;

            Stack<Character> stack = new Stack<>();
            boolean isOkay =true;

            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c=='('){
                    stack.push(c);
                }else if(c=='['){
                    stack.push(c);
                }else if(c==')'){
                    if(stack.isEmpty() || stack.peek()=='['){
                        isOkay=false;
                        break;
                    }else if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }else if(!stack.isEmpty() && stack.peek()==']'){
                        stack.push(c);
                    }
                }else if(c==']'){
                    if(stack.isEmpty() || stack.peek()=='('){
                        isOkay=false;
                        break;
                    }else if(!stack.isEmpty() && stack.peek()=='['){
                        stack.pop();
                    }else if(!stack.isEmpty() && stack.peek()==')'){
                        stack.push(c);
                    }
                }
            }

            if(isOkay&&stack.isEmpty()){
                sb.append("yes").append("\n");

            }else {
                sb.append("no").append("\n");
            }

        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();



    }
}