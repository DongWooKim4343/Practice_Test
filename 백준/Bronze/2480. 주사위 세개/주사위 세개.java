import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int result=0;

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1==num2&&num1==num3){
            result = 10000+(num1*1000);
        }else if(num1==num2||num1==num3){
            result = 1000+(num1*100);
        }else if(num2==num3){
            result = 1000+(num2*100);
        }else if(num1!=num2 && num1!=num3){
            int[] numArr={num1,num2,num3};
            int bigNum=numArr[0];
            for(int i=0;i<numArr.length;i++)
                if(bigNum<numArr[i]){
                    bigNum=numArr[i];

                }
            result = bigNum*100;
        }
        System.out.println(result);
    }
}