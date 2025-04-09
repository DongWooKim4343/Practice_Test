import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine()); //굴다리 길이
        int count = Integer.parseInt(br.readLine()); // 가로등 개수

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] where = new int[count]; //가로등 위치 배열

        for(int i=0; i<count ; i++){
            where[i] = Integer.parseInt(st.nextToken());
        }

        //가로등의 높이를 이진 탐색으로 찾기
        int low = 1;
        int high = length;
        int answer = length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // 여기에 'mid' 높이로 모든 구간을 커버 가능한지 확인하는 로직이 필요
            if (canCover(length, where, mid)) {
                // 가능하다면, 더 작은 높이도 가능한지 탐색하고 현재 높이를 답 후보로 저장
                answer = mid;
                high = mid - 1;
            } else {
                // 불가능하다면, 더 큰 높이가 필요함
                low = mid + 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }


    static boolean canCover(int tunnelLength, int[] where, int height) {
    // 첫 가로등의 왼쪽 끝(where[0] - height)이 0보다 크면 커버 못함
    if (where[0] - height > 0) {
        return false;
    }

    for (int i = 1; i < where.length; i++) {
        // i번째 가로등의 왼쪽 끝(where[i] - height)이
        // (i-1)번째 가로등의 오른쪽 끝(where[i-1] + height)보다 더 오른쪽에 있다면 빈 공간이 있다는 의미
        if (where[i] - height > where[i - 1] + height) {//2*hight 보다 크면됨
            return false; 
        }
    }

    
    // 마지막 가로등의 오른쪽 끝(where[where.length - 1] + height)이 tunnelLength보다 작으면 커버 못함
    if (where[where.length - 1] + height < tunnelLength) {
        return false;
    }


    return true;
    }
}