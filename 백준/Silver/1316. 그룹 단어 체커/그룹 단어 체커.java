import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        int N = Integer.parseInt(br.readLine());


        for(int i=0; i<N; i++){
            Set<Character> set = new HashSet<>();
            String str = br.readLine();
            set.add(str.charAt(0));
            boolean bool = true;
            for(int j=1; j<str.length(); j++){
                char temp = str.charAt(j-1);
                char c = str.charAt(j);

                if(set.contains(c)){
                    if (temp != c) {
                        bool=false;
                        break;
                    }
                }else {
                    set.add(c);
                }
            }
            if(bool){
                count++;
            }
        }

        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();
    }
}