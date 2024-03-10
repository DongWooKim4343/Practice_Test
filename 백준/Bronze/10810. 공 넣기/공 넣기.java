import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter (new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(input.readLine()," ");
        int basketCount =Integer.parseInt(st.nextToken());
        int ballNum = Integer.parseInt(st.nextToken());
        int[] basket= new int[basketCount];

        for(int i=0; i<ballNum;i++){
            st = new StringTokenizer(input.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            for (int j = num1-1; j<num2; j++){
                basket[j] = num3;
            }
        }
        for (int i=0; i<basket.length;i++){
            output.write(basket[i]+" ");
        }
        output.flush();

    }
}