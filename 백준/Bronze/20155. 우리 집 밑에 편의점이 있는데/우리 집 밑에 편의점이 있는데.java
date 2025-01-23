import java.util.*;


class Main{
    public static void main(String[] args){
        //N 편의점수, M브랜드수
        //브랜드당 편의점
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        Map<Integer,Integer> count = new HashMap<>();
        for(int i = 0; i < N; i++){
            int brandCount = input.nextInt();
            count.put(brandCount, count.getOrDefault(brandCount, 0) + 1);
        }

        // 최댓값 찾기 
        int maxValue = 0; // 최댓값을 저장할 변수
        for (int value : count.values()) {
            maxValue = Math.max(maxValue, value);
        }

        System.out.println(maxValue);
    }
}