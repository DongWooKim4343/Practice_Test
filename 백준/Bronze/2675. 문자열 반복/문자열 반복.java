import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//첫째줄에 테스트 개수를 정한다.
//문자열에 input을 하는 것을 하나 만들고
// 처음 받은 숫자를 for문 참 조건으로 하고
// 뒤에 공백에 붙어서 받은 문자를 처음 숫자 만큼 반복해준다
// R을 input에 받아서 반복문도 하나 만들어준다.
// S와 R을 입력받은 것을 출력한다

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(input.readLine());

        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(input.readLine()," ");
            int numR = Integer.parseInt(st.nextToken());
            String strS = st.nextToken();
            ;
            for(int j=0; j<strS.length(); j++ ){
                for(int k=0; k<numR; k++){
                    output.write(strS.charAt(j));

                    }
            }
            output.write("\n");
        }
        output.flush();
    }
}

