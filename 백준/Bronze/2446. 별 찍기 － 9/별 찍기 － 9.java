import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));


        int num = Integer.parseInt(input.readLine());
        input.close();

        for (int i = 1; i <= (2 * num) - 1; i += 2) {
            for (int j = 1; j < i; j += 2) {
                System.out.print(" ");
            }
            for (int j = (2 * num) - 1; j >= i; j -= 1) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = (2 * num) - 3; i >= 1; i -= 2) {
            for (int j = 1; j < i; j += 2) {
                System.out.print(" ");
            }
            for (int j = (2 * num) - 1; j >= i; j -= 1) {
                System.out.print("*");
            }
            System.out.println(" ");


        }


    }
}
