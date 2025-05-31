import java.io.*;
import java.util.*;

class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            int[] aa = isPalindrome(br.readLine());
            sb.append(aa[0]).append(" ").append(aa[1]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    static int recursion(String s, int l, int r){
        count++;
        if(l>=r) return 1;
        else if(s.charAt(l) != s.charAt(r))return 0;
        else return recursion(s, l+1, r-1);
    }
    static int[] isPalindrome(String s){
        count = 0;
        int[] result = new int[2];
        int rec = recursion(s, 0, s.length()-1);
        result[0] = rec;
        result[1] = count;
        return result;
    }
}