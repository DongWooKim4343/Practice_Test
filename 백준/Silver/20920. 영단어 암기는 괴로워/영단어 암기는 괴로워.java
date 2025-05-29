import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();

        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.length() >= M){
                words.put(str, words.getOrDefault(str, 0)+1);
            }
        }

        Set<String> set = words.keySet();
        List<String> list = new ArrayList<>(set);

        Comparator<String> custom = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                int fre1 = words.get(s1);
                int fre2 = words.get(s2);

                if(fre1 != fre2){
                    return fre2-fre1; //fre2가 fre1보다 클 경우 앞으로감(양수반환), s1은 음수가 반환되야 정렬시 앞순
                }

                if(s1.length() !=s2.length()){
                    return s2.length()-s1.length(); //이 또한 s2가 더 길면 양수반환하여 s1을 뒷순서로
                }

                return s1.compareTo(s2);
            }
        };

        Collections.sort(list, custom);

        StringBuilder sb = new StringBuilder();

        for(String s : list){
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}