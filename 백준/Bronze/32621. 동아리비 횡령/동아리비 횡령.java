import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        boolean bbb = false;

        int plusIndex = -1;
        int plusCount = 0;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if (c == '+') {
                plusIndex = i;
                plusCount++;
            }

            // '+'갯수 거르기
            if (plusCount == 1 && plusIndex > 0 && plusIndex < str.length() - 1) {

                String left = str.substring(0, plusIndex);
                String right = str.substring(plusIndex + 1);

                if (left.equals(right)) {

                    boolean ccc = true;

                    //첫숫자 0 거르기
                    if (left.charAt(0) == '0') {
                        ccc = false;
                    } else {
                        //문자 거르기
                        for (int j = 0; j < left.length(); j++) {
                            if (!Character.isDigit(left.charAt(j))) {
                                ccc = false;
                                break;
                            }
                        }
                    }


                    if (ccc) {
                        bbb = true;
                    }
                }
            }
        }

            if (bbb) {
                bw.write("CUTE");
            } else {
                bw.write("No Money");
            }

            bw.flush();
            bw.close();
            br.close();

    }
}




