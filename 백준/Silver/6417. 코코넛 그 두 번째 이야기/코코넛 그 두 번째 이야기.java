import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int coconut = Integer.parseInt(br.readLine());
            if(coconut == -1){
                break; 
            }

            int result = -1; 
        
            for (int i = coconut - 1; i >= 2; i--) {

                int tempCoconut = coconut; 
                boolean possible = true; 

                for (int person = 1; person <= i; person++) {
                    if (tempCoconut % i != 1) {
                        possible = false; 
                        break; 
                    }

                    // 원숭이에게 1개 주고, i 등분하고 1등분 훔쳐감
                    tempCoconut = ((tempCoconut - 1) / i) * (i - 1);

                    if (tempCoconut < 0) {
                         possible = false;
                         break;
                    }
                }

                // 
                if (possible && tempCoconut >= 0 && tempCoconut % i == 0) {
                    result = i;
                    break; 
                }
                
            } 

            
            if (result != -1) {
                bw.write(coconut + " coconuts, " + result + " people and 1 monkey");
                bw.newLine();
            } else {
                bw.write(coconut + " coconuts, no solution");
                bw.newLine();
            }

        } 

        bw.flush();
        bw.close();
        br.close();
    }
}