import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] arr = my_string.split(""); 

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            // s부터 e까지 뒤집은 문자열을 임시 배열에 저장
            String[] tempArr = new String[e - s + 1];
            int tempIndex = 0;
            for (int j = e; j >= s; j--) {
                tempArr[tempIndex++] = arr[j];
            }

            // 뒤집은 문자열을 원래 배열에 적용
            tempIndex = 0;
            for(int j = s; j <= e; j++) {
                arr[j] = tempArr[tempIndex++];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}