import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        if(x*y>0){
            if(x+y>0){
                System.out.println("1");
            }else if(x+y<0){
                System.out.println("3");
            }
        }else if(x*y<0){
            if(x<y){
                System.out.println("2");
            }else if(x>y){
                System.out.println("4");
            }
        }
        
    }
}