import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i =1; i<=9;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}