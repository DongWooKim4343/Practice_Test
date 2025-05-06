import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //A 일반, B특별, C 서비스
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken()); //일반메뉴 20000원 주문 이상
        int C = Integer.parseInt(st.nextToken()); //일반+특별 메뉴 50000원 이상

        Map<String, Integer> normal = new HashMap<>();
        Map<String, Integer> special = new HashMap<>();
        Map<String, Integer> service = new HashMap<>();

        for(int i=0; i<A; i++){
            st = new StringTokenizer(br.readLine());
            String menu = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            normal.put(menu, price);
        }
        for(int i=0; i<B; i++){
            st = new StringTokenizer(br.readLine());
            String menu = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            special.put(menu, price);
        }
        for(int i=0; i<C; i++){
            String menu = br.readLine();
            service.put(menu, 0);
        }

        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        long spSum=0;
        long seCount =0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(normal.containsKey(str)){
                sum += normal.get(str);
            }else if(special.containsKey(str)){
                spSum += special.get(str);
            }else if(service.containsKey(str)){
                seCount++;
            }
        }

        boolean isSuccess = true;

        if(seCount >=2){
            isSuccess = false;
        }
        if(sum < 20000 && spSum >0 ){
            isSuccess = false;
        }
        if(seCount >= 1 && sum+spSum <50000){
            isSuccess =false;
        }

        if(isSuccess){
            bw.write("Okay");
        }else{
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}