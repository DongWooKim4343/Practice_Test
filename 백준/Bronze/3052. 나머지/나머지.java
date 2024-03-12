import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums=new int[10];
        for(int i =0; i<nums.length; i++){
            nums[i]= Integer.parseInt(input.readLine());
            nums[i]=nums[i]%42;
        }
        boolean check;
        int checkNum=0;

        for(int i=0;i< nums.length;i++){
            check=false;
            for(int j=(i+1); j< nums.length; j++){
                if(nums[i]==nums[j]){
                    check=true;
                    break;
                }

                }
            if(check==false){
                checkNum+=1;
            }
        }
        output.write(Integer.toString(checkNum));
        output.flush();
        input.close();
        output.close();


    }
}