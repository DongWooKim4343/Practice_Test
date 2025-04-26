import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //N개의 수업
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();
        int sum=0;

        for(int i=0 ; i<N; i++){
            int k = Integer.parseInt(br.readLine()); //과목의 수강생 수
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<k; j++){
                String stu = st.nextToken();
                map.put(stu, map.getOrDefault(stu, 0)+1);
            }

        }

        List<Integer> list = new ArrayList<>(map.values());

        for(int n : list){
            if(n>=M){
                sum++;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}