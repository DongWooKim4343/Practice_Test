import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        input.close();
        System.out.println(a+b+c);
    }
}