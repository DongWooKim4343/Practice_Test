import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Human[] arr = new Human[num];

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            arr[i] = new Human(weight, height);
        }

        int[] ranks = new int[num];

        for(int i=0; i<num; i++){
            int rank = 1;
            for(int j=0; j<num; j++){
                if(i!=j){
                    if(arr[i].height < arr[j].height && arr[i].weight < arr[j].weight){
                        rank++;
                    }
                }

            }
            ranks[i] = rank;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            sb.append(ranks[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static class Human {
        int weight;
        int height;
        public Human(int weight, int height){
            this.weight = weight;
            this.height = height;
        }
    }
}