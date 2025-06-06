import java.util.*;
import java.io.*;

class Main{

    static int K;
    static int count;
    static int[] temp;
    static int result = -1;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arrA = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arrA[i]=Integer.parseInt(st.nextToken());
        }
        mergeSort(arrA, 0, arrA.length-1);

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
    static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end-start)/2;
            mergeSort(arr, start, mid); //전반부 정렬
            mergeSort(arr, mid+1, end); //후반부 정렬
            merge(arr, start, mid, end);
        }
    }
    static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int t = 0;
        //임시 배열 생성
        temp = new int[end-start+1];

        //두 부분 배열을 비교하며 temp에 오름차순 저장
        while (i <= mid && j <= end) { // 양쪽 부분 배열 모두에 원소가 남아있는 동안 반복
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                i++;
            } else {
                temp[t] = arr[j];
                j++;
            }
            t++;
        }
        // 첫 번째 부분 배열에 남은 요소가 있는 경우 temp에 복사
        while (i <= mid) {
            temp[t] = arr[i];
            i++;
            t++;
        }

        // 두 번째 부분 배열에 남은 요소가 있는 경우 temp에 복사
        while (j <= end) {
            temp[t] = arr[j];
            j++;
            t++;
        }

        // 임시 배열 temp의 내용을 원래 배열 에 복사
        i = start; // arr에 복사할 시작 위치
        t = 0;     // temp에서 읽어올 시작 위치
        while (i <= end) { // start부터 end까지의 모든 위치에 대해
            count++;
            arr[i] = temp[t];
            if(count==K){
                result =temp[t];
            }
            i++;
            t++;
        }
    }
}
