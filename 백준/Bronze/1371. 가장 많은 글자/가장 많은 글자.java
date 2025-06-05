import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Integer> map = new HashMap<>();

        while(true){
            String str = br.readLine();
            if(str==null)break;

            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }
        }
        int max = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            max = Math.max(entry.getValue(),max);
        }
        List<Character> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() ==max){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        for(Character c : list){
            bw.write(c);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}