import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = str.split("");
        int[] arrInt = new int[arr.length];

        int index = -1;

        //가중치
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("*")){
                if(i%2==0){
                    arrInt[i] = Integer.parseInt(arr[i]);
                }else {
                    arrInt[i] = Integer.parseInt(arr[i])*3;
                }
            }else{
                index = i;
            }
        }

        int sum = 0;

        for(int n : arrInt){
            sum+=n;
        }

        int answer = 0;
        for(int i=0; i<10; i++){
            int temp = sum;
            int ii = i;
                    
            if(index % 2>0){
                ii = i*3;
            }
            temp +=ii;
            if(temp % 10 == 0){
                answer = i;
            }
        }

        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();


    }
}