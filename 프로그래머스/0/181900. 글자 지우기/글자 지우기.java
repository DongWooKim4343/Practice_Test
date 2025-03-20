import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = my_string;
        Arrays.sort(indices); // 인덱스 배열을 오름차순으로 정렬

        for (int i = indices.length - 1; i >= 0; i--) {
            int index = indices[i];
            // index 위치의 문자만 제거
            answer = answer.substring(0, index) + answer.substring(index + 1);
        }

        return answer;
    }
}