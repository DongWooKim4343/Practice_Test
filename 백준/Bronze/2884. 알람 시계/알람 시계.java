import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int min = input.nextInt();
        int num = 45;

        if((min-num)<0){
            min= min-num+60;
            if(hour>0){
                hour=hour-1;
            }else if(hour==0){
                hour=hour+23;
            }
        }else if((min-num)>=0){
            min =min-num;
        }
        System.out.print(hour+" "+min);

    }
}