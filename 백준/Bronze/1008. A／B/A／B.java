import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        
        double div = (double) a/b;
        
        System.out.println(div);
        input.close();
    }
}