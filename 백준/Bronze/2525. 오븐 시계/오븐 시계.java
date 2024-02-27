import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int min = input.nextInt();
        int time = input.nextInt();

        while(true){
            if(min+time>=60){
                min=min-60;
                if(hour<24){
                    hour=hour+1;
                    if(hour==24){
                        hour=0;
                    }
                }else if(hour==24){
                    hour= 0;
                }
            }else{
                min = min + time;
                System.out.println(hour+" "+min);
                return;
            }
        }

    }
}