import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = input.readLine();


        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<arr.length; i++){
            if(str.contains(arr[i])){
                str=str.replace(arr[i],"x");
            }
        }
        output.write(String.valueOf(str.length()));
        output.flush();

    }
}