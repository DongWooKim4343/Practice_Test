import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> answerMap = new HashMap<>();
        int check = 0;
        double result = 0;
        int length = stages.length;
        
        // N스테이지 갯수, i 현재 스테이지
        for(int i = 1; i<= N; i++){
            check = 0;
            for(int j=0 ; j<stages.length; j++){
                if(i==stages[j]){
                    check++;
                }
            }
            
            //현재 스테이지 i에 check명이 머물러 있음
            if (length == 0) { // 스테이지에 도달한 유저가 없는 경우
                result = 0.0;
            } else { 
            result = (double)check/length; // 전체 나누기 현재스테이지
            }
            answerMap.put(i,result);
            length = length - check;
        }
        
         // 실패율을 기준으로 내림차순 정렬, 실패율이 같으면 스테이지 번호 오름차순
        List<Integer> stageList = new ArrayList<>(answerMap.keySet());
        Collections.sort(stageList, (s1, s2) -> {
            // Double 값 비교를 위해 compareTo 사용
            int compareResult = answerMap.get(s2).compareTo(answerMap.get(s1));
            if (compareResult == 0) {
                return s1 - s2; // 실패율이 같으면 스테이지 번호 오름차순 (명확하게 정의)
            } else {
                return compareResult; // 실패율 내림차순
            }
        });

        // 정렬된 스테이지 번호를 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i);
        }

        return answer;
    }
}