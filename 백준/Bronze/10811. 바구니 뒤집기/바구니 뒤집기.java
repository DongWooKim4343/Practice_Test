import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

//배열을 N개 크기로 만든다, 1 2 3 4 5를 넣어야 할듯
// 총 M번 순서를 바꿀 수 있따.
// 그 후 입력은 i번째부터 j번째의 순서를 싹 바꾸는듯 temp로 바꿔보자

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(input.readLine()," ");

        int nBasket = Integer.parseInt(st.nextToken());
        int[] mBasketArr = new int[nBasket+1];

        int mNum = Integer.parseInt(st.nextToken());

        for(int i=0; i<mBasketArr.length; i++){
            mBasketArr[i]=i;
        }

        for(int i =1; i<=mNum; i++){
            st = new StringTokenizer(input.readLine()," ");
            int numI = Integer.parseInt(st.nextToken());
            int numJ = Integer.parseInt(st.nextToken());
            for(int x =numI; x<numJ; x++){

                    int temp=0;
                    temp = mBasketArr[numI];
                    mBasketArr[numI]=mBasketArr[numJ];
                    mBasketArr[numJ]=temp;

                    numI++;
                    numJ--;


            }

        }
        for(int i =1; i<mBasketArr.length;i++){
            output.write((mBasketArr[i]) +" ");
        }
        output.flush();
    }
}
