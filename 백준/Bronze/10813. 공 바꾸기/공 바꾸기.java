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
        int nBasket =Integer.parseInt(st.nextToken());
        int mBall = Integer.parseInt(st.nextToken());

        int[] basket= new int[nBasket];

        for(int i =0; i<basket.length; i++){
            basket[i]=i+1;
        }
        for(int i=0; i<mBall; i++){
            st = new StringTokenizer(input.readLine()," ");
            int numI= Integer.parseInt(st.nextToken());
            int numJ= Integer.parseInt(st.nextToken());
            int temp=0;
            temp = basket[numI-1];
            basket[numI-1]=basket[numJ-1];
            basket[numJ-1]=temp;
        }
        for(int i=0; i<nBasket; i++){
            output.write(basket[i]+" ");
        }
        output.flush();

    }
}