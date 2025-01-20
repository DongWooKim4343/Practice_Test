import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = 0;
        int score=512;
        
        while(score>0){
            int count = 0;
            if(A >= score){
                A-=score;
                count++;
            }
            if(B >= score){
                B-=score;
                count++;
            }
            if(count == 1){
                C+=score;
            }
            score= score/2;
            
        }
        System.out.println(C);
        
    }
}