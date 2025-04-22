import java.util.*;
import java.io.*;


class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<String> list = new ArrayList<>();

        for(int i=0; i<num; i++){
            list.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num-1; i++){
            String food = st.nextToken();
            list.remove(food);

            }


        bw.write(list.get(0));
        bw.flush();
        bw.close();
        br.close();

    }
}