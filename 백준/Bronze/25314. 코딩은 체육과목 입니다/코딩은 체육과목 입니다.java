import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        int type = num/4;
        
        for(int i =0 ; i<type;i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}