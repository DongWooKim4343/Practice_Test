import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int QUARTER = 25;
        int DIME = 10;
        int NICKEL = 5;
        int PENNY = 1;

        for(int i=0; i<T ; i++){
            int change = Integer.parseInt(br.readLine()); // 거스름돈 (센트 단위)

            int numQuarters = change / QUARTER;
            change %= QUARTER; // 남은 거스름돈

            int numDimes = change / DIME;
            change %= DIME; // 남은 거스름돈

            int numNickels = change / NICKEL;
            change %= NICKEL; // 남은 거스름돈

            int numPennies = change / PENNY; // 남은 거스름돈은 모두 페니

            bw.write(numQuarters + " " + numDimes + " " + numNickels + " " + numPennies + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}