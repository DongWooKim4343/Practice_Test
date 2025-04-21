import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> sss = new HashSet<>();

        for(int i=0; i<N ; i++){
            sss.add(br.readLine());
        }

        List<String> list = new ArrayList<>(sss);

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //길이가 다르면 길이 순으로 정렬 (오름차순)
                if (s1.length() != s2.length()) {

                    // s1 길이가 더 짧으면 음수, 길면 양수 반환
                    // 음수를 반환하면 s1이 s2보다 먼저 옴
                    // 양수를 반환하면 s1이 s2보다 나중에 옴
                    return s1.length() - s2.length();
                    // Integer.compare(s1.length(), s2.length());
                }
                else {
                    return s1.compareTo(s2);
                }
            }
        };

        Collections.sort(list, customComparator);

        for(String s : list){
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}