import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(input.readLine());

        for(int i=0; i<T; i++){
            long num = Integer.parseInt(input.readLine()); //찾을 순서
            long kk=-1; //묶음번호 초기화
            long low = 1L;
            long high =77777L;

            while(low <= high){
                long mid = low+(high-low)/2; //전체 단어수 중간값

                long totalWords = 3L*((mid*(mid+1))/2); //현재 묶음번호에서 전체 단어수

                if(totalWords >= num){
                    kk = mid;
                    high = mid-1L;
                }else{
                    low = mid+1L;
                }
            }
            long prevKK = kk-1;
            long prevKKwords = 3L*((prevKK*(prevKK+1))/2); //추출한 묶음번호 한칸 전의 총 단어 수
            long choice = num - prevKKwords;

            if(choice <= kk && choice > 0){
                output.write(kk + (kk == 1 ? " dolphin" : " dolphins"));
            }else if(choice <= kk*2 && choice > kk){
                output.write(kk+ (kk == 1 ?" jump" : " jumps" ));
            }else if(choice <= kk*3 && choice > kk*2){
                output.write(String.valueOf("splash"));
            }
            output.newLine();
        }

        output.flush();
        output.close();
        input.close();



    }
}