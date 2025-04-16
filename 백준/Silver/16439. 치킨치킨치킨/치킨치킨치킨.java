import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//회원수
        int M = Integer.parseInt(st.nextToken()); //치킨 종류의수

        int[][] prefer = new int[N][M];

        for(int i=0; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M ; j++){
                prefer[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        for(int i=0; i<M ; i++){
            for(int j=i+1; j<M ; j++){
                for(int k=j+1; k<M ; k++){

                    int tempSum = 0;


                    //사람별로 선호도
                    for(int p=0 ; p<N ; p++){

                        int tempPrefer = Math.max(prefer[p][i], prefer[p][k]);
                        int personPrefer = Math.max(tempPrefer, prefer[p][j]);

                        tempSum+=personPrefer;
                    }

                    answer = Math.max(tempSum, answer);
                }
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}



