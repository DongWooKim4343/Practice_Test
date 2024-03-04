import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] numArr= new int[num];

        for(int i =0;i<num;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            numArr[i]=a+b;
        }
        for(int s : numArr){
            System.out.println(s);
        }

    }
}