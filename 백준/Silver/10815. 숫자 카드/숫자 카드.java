import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(input.readLine());
        int[] arrN = new int[N];
        StringTokenizer st = new StringTokenizer(input.readLine());

        for(int i=0; i<N ; i++){
            arrN[i]=Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(input.readLine());
        int[] arrM = new int[M];
        st = new StringTokenizer(input.readLine());

        for(int i=0; i<M ; i++){
            arrM[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);
       

        int index=0;
        while(index <arrM.length){
            int low = 0;
            int high = arrN.length-1;
            int target = arrM[index];
            boolean trigger=false;

            while(low <= high){
                int mid = low+(high-low)/2;

                if(target > arrN[mid]){
                    low = mid+1;
                }else if(target < arrN[mid]){
                    high = mid-1;
                }else if(target == arrN[mid]){
                    trigger=true;
                    break;
                }
            }
            if(trigger){
                arrM[index] = 1;
            }else{
                arrM[index] = 0;
            }
            index++;

        }
        for(int i=0; i<M ; i++){
            output.write(arrM[i]+" ");
        }
        output.flush();



    }
}