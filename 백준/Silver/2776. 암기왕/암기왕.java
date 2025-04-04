import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T ; i++){
            int N = Integer.parseInt(br.readLine()); // 수첩1의 정수 갯수

            
            HashSet<Integer> note1Set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<N; j++){
                note1Set.add(Integer.parseInt(st.nextToken()));
            }
           

            int M = Integer.parseInt(br.readLine()); // 수첩 2의 정수 갯tn
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int k=0; k<M; k++){ // M번 반복
                int target = Integer.parseInt(st2.nextToken()); // 수첩2의 숫자 하나씩 읽기

                if(note1Set.contains(target)){
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}