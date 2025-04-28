import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());

        if(first + second+ third == 180 && first == second && first == third){
            bw.write("Equilateral");
        }else if((first + second + third == 180 && first == second) || (first + second + third == 180 && first == third) || (first + second + third == 180 && second == third)){
            bw.write("Isosceles");
        }else if(first + second + third == 180 && second != third && second != first){
            bw.write("Scalene");
        }else{
            bw.write("Error");
        }

        bw.flush();
        bw.close();
        br.close();



    }
}