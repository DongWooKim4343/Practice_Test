import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(input.readLine());

        Long[] arr = new Long[number+1]; //0번 인덱스는 0번째수로 취급

        if(number>=0){
            arr[0]=0L;
        }
        if(number>=1){
            arr[1]=1L;
        }

        for(int i=2; i<number+1; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        if(number==0){
            output.write(String.valueOf(0));
        }else{
            output.write(String.valueOf((arr[number])));
        }
        output.flush();
    }
}