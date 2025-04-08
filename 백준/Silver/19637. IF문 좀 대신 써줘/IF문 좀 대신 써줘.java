import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //칭호의 개수
        int M = Integer.parseInt(st.nextToken()); // 칭호를 출력해야하는 캐릭터의 개수

        String[] nicknames = new String[N];
        int[] powers = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            nicknames[i] = st.nextToken();
            powers[i] = Integer.parseInt(st.nextToken());
        }

        String[] answer = new String[M];

        for(int i=0; i<M ; i++){
            int pow = Integer.parseInt(br.readLine());
            int low = 0;
            int high = N-1;


            while(low <= high){
                int mid = low+(high-low)/2;

                if(pow > powers[mid]){
                    low = mid+1;
                }else if(pow <= powers[mid]){
                    high = mid-1;
                }
            }
            answer[i] = nicknames[low];
        }
        for(String s : answer){
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}