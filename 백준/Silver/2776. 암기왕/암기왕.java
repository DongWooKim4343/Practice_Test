import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T ; i++){
            int N = Integer.parseInt(br.readLine());//수첩1의 정수 갯수
            int[] note1 = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<N; j++){
                note1[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(note1);

            int M = Integer.parseInt(br.readLine()); //수첩 2의 정수 갯수
            int[] note2 = new int[M];
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int k=0; k<M; k++){
                note2[k]=Integer.parseInt(st2.nextToken());
            }
            int index =0;
            while(M-- >0){
                int low = 0;
                int high = N-1;
                int target = note2[index];
                boolean trigger = false;

                while(low <= high){
                    int mid = low+(high-low)/2;

                    if(target > note1[mid]){
                        low =mid+1;
                    }else if(target < note1[mid]){
                        high = mid-1;
                    }else if(target == note1[mid]){
                        trigger = true;
                        break;
                    }
                }
                if(!trigger){
                    bw.write(0+"\n");
                }else{
                    bw.write(1+"\n");
                }
                index++;
            }

        }
        bw.flush();
    }
}