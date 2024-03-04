import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalPrice= input.nextInt();
        int sum=0;


        int num = input.nextInt();
        int[] prices =new int[num];

        for(int i=0; i<num; i++){
            int money =input.nextInt();
            int count =input.nextInt();
            prices[i]=money*count;
        }
        for(int s : prices){
            sum = sum+s;
        }
        if(totalPrice == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}