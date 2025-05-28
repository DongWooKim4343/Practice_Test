import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        //최빈값
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int avg = Math.round((float) sum / N);
        int med;

        //중앙값
        Arrays.sort(arr);
        int nnn = N - 1;
        if (N % 2 == 0) {
            int aa = (nnn / 2) - 1;
            int bb = (nnn / 2) + 1;
            med = (arr[aa] + arr[bb]) / 2;
        } else {
            med = arr[nnn/2];
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        int modValue = 0;
        int mod = 0;

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            int key = entry.getKey();
            int val = entry.getValue();

            modValue = Math.max(modValue, val);
        }

        for(Map.Entry<Integer, Integer> entry : entrySet){
            int key = entry.getKey();
            int val = entry.getValue();

            if(val==modValue){
                list.add(key);
            }
        }

        Collections.sort(list);
        if(list.size()>1){
            mod = list.get(1);
        }else{
            mod = list.get(0);
        }


        int range = arr[N-1]-arr[0];

        bw.write(avg + "\n" + med + "\n" + mod + "\n" + range);
        bw.flush();
        bw.close();
        br.close();



    }
}