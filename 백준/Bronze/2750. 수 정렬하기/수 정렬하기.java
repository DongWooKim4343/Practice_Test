import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());
        int[] arr = new int[num];

        for(int i=0; i<arr.length; i++ ){
            arr[i]= Integer.parseInt(input.readLine());
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        for(int i=0; i<arr.length; i++){
            output.write(arr[i]+"\n");
        }
        output.flush();

    }
}