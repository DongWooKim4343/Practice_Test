import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));


        String word = input.readLine();
        boolean test = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                test = true;
            } else if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                test = false;
                break;
            }
        }
            if (test) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

