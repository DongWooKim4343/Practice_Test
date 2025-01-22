import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String binaryNum=null;
        StringBuilder binaryNumSum = new StringBuilder();
        
        for(int i =0; i<3; i++){
            int num = input.nextInt();
            if(num>=8){
                binaryNum = Integer.toBinaryString(num);
                binaryNumSum.append(binaryNum.substring(binaryNum.length()-4));
            }else if(num<8){
                binaryNum = Integer.toBinaryString(num);
                StringBuilder temp = new StringBuilder();
                for(int j =0; j<4-Integer.toBinaryString(num).length(); j++){
                    temp.append("0");
                }
                binaryNumSum.append(temp);
                binaryNumSum.append(binaryNum);
                
            }
        }
        int binaryAnswer = Integer.parseInt(binaryNumSum.toString(),2);
        String answer = String.format("%04d",binaryAnswer);
        
        System.out.println(answer);
        

    }
}