import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//값을 읽고
//값의 자릿수 하나당 숫자로 변환
//자릿수 하나당 1초씩 추가 렝스만큼 더해보면 될듯

class Main{
    public static void main(String[] agrs) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String alpha = input.readLine();
        String[] alphaArr = alpha.split("");

        for(int i=0; i<alphaArr.length; i++){
            if((alphaArr[i]).equals("A")){
                alphaArr[i]="2";
            } else if (alphaArr[i].equals("B")){
                alphaArr[i]="2";
            }else if (alphaArr[i].equals("C")){
                alphaArr[i]="2";
            }else if (alphaArr[i].equals("D")){
                alphaArr[i]="3";
            }else if (alphaArr[i].equals("E")){
                alphaArr[i]="3";
            }else if (alphaArr[i].equals("F")){
                alphaArr[i]="3";
            }else if (alphaArr[i].equals("G")){
                alphaArr[i]="4";
            }else if (alphaArr[i].equals("H")){
                alphaArr[i]="4";
            }else if (alphaArr[i].equals("I")){
                alphaArr[i]="4";
            }else if (alphaArr[i].equals("J")){
                alphaArr[i]="5";
            }else if (alphaArr[i].equals("K")){
                alphaArr[i]="5";
            }else if (alphaArr[i].equals("L")){
                alphaArr[i]="5";
            }else if (alphaArr[i].equals("M")) {
                alphaArr[i] = "6";
            }else if (alphaArr[i].equals("N")) {
                alphaArr[i] = "6";
            }else if (alphaArr[i].equals("O")) {
                alphaArr[i] = "6";
            }else if (alphaArr[i].equals("P")) {
                alphaArr[i] = "7";
            }else if (alphaArr[i].equals("Q")) {
                alphaArr[i] = "7";
            }else if (alphaArr[i].equals("R")) {
                alphaArr[i] = "7";
            }else if (alphaArr[i].equals("S")) {
                alphaArr[i] = "7";
            }else if (alphaArr[i].equals("T")) {
                alphaArr[i] = "8";
            }else if (alphaArr[i].equals("U")) {
                alphaArr[i] = "8";
            }else if (alphaArr[i].equals("V")) {
                alphaArr[i] = "8";
            }else if (alphaArr[i].equals("W")) {
                alphaArr[i] = "9";
            }else if (alphaArr[i].equals("X")) {
                alphaArr[i] = "9";
            }else if (alphaArr[i].equals("Y")) {
                alphaArr[i] = "9";
            }else if (alphaArr[i].equals("Z")) {
                alphaArr[i] = "9";
            }
        }
        int sum=0;
        for(int i=0; i<alphaArr.length;i++) {
            int num= Integer.parseInt(alphaArr[i]);
            sum+=num;
        }
        output.write(sum+ alphaArr.length+"");
        output.flush();;
    }
}