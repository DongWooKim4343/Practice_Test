import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stackVer = new Stack<>();
        Stack<Integer> stackHor = new Stack<>();
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0; i < N; i++){
            stackHor.push(list.get(N-1-i));
        }

        int number = 1;

        while(number <= N){
            if(!stackVer.isEmpty() && stackVer.peek() == number){
                stackVer.pop();
                number++;
            }
            else if(!stackHor.isEmpty() && stackHor.peek() == number){
                stackHor.pop();
                number++;
            }
            else if (!stackHor.isEmpty()){ 
                stackVer.push(stackHor.pop());
            }
            else{
                break;
            }
        }

        if(number>N){
            bw.write("Nice");
        }else{
            bw.write("Sad");
        }

        bw.flush();
        br.close();
        bw.close();



    }
}