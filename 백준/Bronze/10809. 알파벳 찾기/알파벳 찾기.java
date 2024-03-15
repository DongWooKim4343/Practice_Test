import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

//알파벳 소문자에 해당하는 배열에 -1을 할당
// 반복문을 돌려서 문자를 숫자로 만들고 인덱스값과 반복횟수를 맞춰서 위치를 구해본다



class Main{
public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] alphaArr = new int[26];

    for(int i=0; i<alphaArr.length; i++){
        alphaArr[i]=-1;
    }

    String word = input.readLine();
    for(int i =0; i<word.length(); i++){
        for(int j=0; j<26; j++){
            if((int)word.charAt(i)-97 ==j){
                if(alphaArr[j]!=-1) {
                    break;

                } else {
                    alphaArr[j] = i;
                }
            }
        }
    }
    for(int i =0; i< alphaArr.length;i++) {
        output.write(alphaArr[i]+" ");
    }
    output.flush();
}
}