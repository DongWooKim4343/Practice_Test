import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[][] chessBoard = new String[8][8];
        int count = 0;

        for(int i = 0; i < 8; i++){
            String[] array = input.nextLine().split("");
            for(int j = 0; j < 8; j++) {
                chessBoard[i][j] = array[j];
            }
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i + j) % 2 == 0) {
                    if(chessBoard[i][j].equals("F")){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}