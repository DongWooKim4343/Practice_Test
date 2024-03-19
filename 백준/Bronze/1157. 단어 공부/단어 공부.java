import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//소문자 a 의 아스키는 97
//대문자 A의 아스키는 65

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphaArr = new int[26];

        for (int i = 0; i < alphaArr.length; i++) {
            alphaArr[i] = 0;
        }

        String word = input.readLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 96 && word.charAt(i) <= 123) {
                int wordAscii = (int) word.charAt(i) - 97;
                alphaArr[wordAscii]++;
            } else if (word.charAt(i) >= 65 && word.charAt(i) <= 91) {
                int wordAscii = (int) word.charAt(i) - 65;
                alphaArr[wordAscii]++;
            }

        }

        int maxIndex = 0;
        int maxNum=alphaArr[0];
        int doubleCheck = 0;

        for (int i = 0; i < alphaArr.length; i++) {
            if(alphaArr[i]>maxNum){
                maxNum=alphaArr[i];
                maxIndex=i;
            }

            }
        for (int i = 0; i < alphaArr.length; i++){
            if(alphaArr[maxIndex]==alphaArr[i]){
                doubleCheck++;
            }
        }
     

        if(doubleCheck<2) {
            char ch = (char) (maxIndex + 65);
            System.out.println(ch);
        }else {
            System.out.println("?");
        }
        }

    }




