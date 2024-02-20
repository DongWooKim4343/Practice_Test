import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        

        
        arr1[0]=(num1/100)*100;
        arr1[1]=((num1%100)/10)*10;
        arr1[2]=(num1%100)%10;
        
        arr2[0]=num2/100;
        arr2[1]=(num2%100)/10;
        arr2[2]=(num2%100)%10;
        
        System.out.println(arr2[2]*num1);
        System.out.println(arr2[1]*num1);
        System.out.println(arr2[0]*num1);
        System.out.println(num2*num1);
    }
}