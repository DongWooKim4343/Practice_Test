import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        ArrayList<Integer> numbers = new ArrayList<>();

        while((line=br.readLine())!=null && !line.isEmpty()){
            StringTokenizer st = new StringTokenizer(line);
            while(st.hasMoreTokens()){
                numbers.add(Integer.parseInt(st.nextToken()));
            }
        }

        int maxGCD = 0;
        for(int i=0; i<numbers.size(); i++){
            for(int j=i+1; j<numbers.size(); j++){
                int a = numbers.get(i);
                int b = numbers.get(j);

                int temp =getGCD(a,b);
                maxGCD = Math.max(maxGCD,temp);

            }
        }
        bw.write(maxGCD+"\n");
        bw.flush();
        br.close();
        bw.close();

    }

    public static int getGCD(int a, int b){
        if(b==0){
            return a;
        }
        return getGCD(b,a%b);
    }
}