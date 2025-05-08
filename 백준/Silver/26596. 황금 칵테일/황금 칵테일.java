import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap();

        double gold = 1.618;

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int amount = Integer.parseInt(st.nextToken());
            map.put(str,(amount+map.getOrDefault(str, 0)));
        }

        List<Integer> list = new ArrayList<>(map.values());
        boolean isGold = false;

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size();j++){

                double temp = (double)list.get(i) * gold;

                if ((int) temp == list.get(j)) {
                    isGold = true;
                    break;
                }
            }
        }

        if(isGold){
            bw.write("Delicious!");
        }else{
            bw.write("Not Delicious...");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}