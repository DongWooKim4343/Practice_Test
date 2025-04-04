import java.util.*;
 import java.io.*;
 
 class Main{
     public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         StringTokenizer st = new StringTokenizer(br.readLine());
         
         String N = st.nextToken();
         int power = Integer.parseInt(st.nextToken());
         int bb = 1;
         int answer = 0;
         
         
         for(int i=N.length()-1 ; i>=0; i--){
             char c = N.charAt(i);
             int value=0;
             if(c >='0' && c <= '9'){
                 value = c-'0';
             }else{
                 value = c-'A'+10;
             }
             answer += value*bb;
             bb*=power;
         }
         bw.write(answer+"");
         bw.flush();
         
     }
 }