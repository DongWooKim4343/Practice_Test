import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = input.readLine();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<num.length(); i++){
            list.add(Integer.parseInt(""+num.charAt(i)));
        }
        Collections.sort(list);

        
        for(int i=list.size()-1 ; i>=0; i--){
            output.write(String.valueOf(list.get(i)));
        }
        output.flush();
        output.close();
        input.close();


    }
}