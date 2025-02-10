import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Long num = Long.parseLong(input.readLine());
        int turn = 0; 
        
        if(num%2==0){
            output.write("CY");
        }else{
            output.write("SK");
        }
        output.flush();
        /*while(num!=0){
            if(num >)
        }*/
        
    }
}