import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] paper = new boolean[100][100];

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    paper[j][k] = true;
                }
            }
        }
        int answer = 0;
        for(int i=0; i<paper.length; i++){
            for(int j=0; j<paper[0].length; j++){
                if(paper[i][j]){
                    answer++;
                }
            }
        }
        bw.write(answer+"");
        bw.flush();
        br.close();
        bw.close();


    }
}