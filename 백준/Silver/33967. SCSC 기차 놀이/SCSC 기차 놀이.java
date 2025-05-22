import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        int count = 0;

        String str= br.readLine();
        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (i == 0) {
                stack.push(c);
            } else {
                if (stack.peek() == '2') {
                    if (c == '2') {
                        count += 2;
                    } else if (c == '5') {
                        count++;
                    } else {
                        count++;
                    }
                } else if (stack.peek() == '5') {
                    if (c == '5') {
                        count += 2;
                    } else if (c == '2') {
                        count++;
                    } else {
                        count++;
                    }
                } else if (stack.peek() == '[') {
                    if (c == '5' || c == '2') {
                        count++;
                    } else if (c == ']' || c == '[') {
                        count++;
                    }
                } else if (stack.peek() == ']') {
                    if (c == '5' || c == '2') {
                        count++;
                    } else if (c == ']') {
                        count++;
                    }
                }
            }
            stack.push(c);
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}