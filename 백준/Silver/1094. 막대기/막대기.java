import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int stick = 64;
        int sum = stick;
        int value = 1;
        
        while(sum!=x){
            if(sum>=x){
                stick =stick/2;
                sum -=stick;
            }else if(sum<x){
                stick = stick/2;
                sum +=stick;
                value++;
            }
        }
        System.out.println(value);
    }
}