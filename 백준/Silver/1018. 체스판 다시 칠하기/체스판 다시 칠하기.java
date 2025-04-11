import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열


        int answer = 64;

        char[][] chess = new char[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                chess[i][j]=str.charAt(j);
            }
        }

        for(int i=0; i <= N-8; i++){ 
            for(int j=0; j <= M-8; j++){

                int countW = 0;
                int countB = 0;

                for(int k = i; k < i + 8; k++){
                    for(int l = j; l < j + 8; l++){

                        char currentCell = chess[k][l];


                        //    (k-i + l-j) 값이 짝수면 짝수 좌표끼리 홀수 좌표끼리 색 같음
                        boolean isEven = (k - i + l - j) % 2 == 0; //체스판 짤랐을때 시작좌표 구하는 식

                        // W로 시작하는 패턴일 경우
                        char startW = isEven ? 'W' : 'B';
                        if (currentCell != startW) {
                            countW++; // 다르면 카운트 증가
                        }

                        // B로 시작하는 패턴일 경우
                        char startB = isEven ? 'B' : 'W';
                        if (currentCell != startB) {
                            countB++; // 다르면 카운트 증가
                        }


                    }
                }

                int currentMin = Math.min(countW, countB);

                
                answer = Math.min(answer, currentMin);

            } 
        } 



        bw.write(answer+"");
        bw.flush();
        br.close();
        bw.close();
        
    }
}