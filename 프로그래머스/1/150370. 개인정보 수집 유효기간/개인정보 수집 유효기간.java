import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer ={};
        ArrayList<Integer> answerList = new ArrayList<>(); 
        Map<String, Integer> termHash = new HashMap<>();
    
        
        int dateCount =28;
        int monthCount=12;
        
        today = today.replace(".", "");
        
        
        int year = Integer.parseInt(today.substring(0,4))*monthCount*dateCount;
        System.out.println(year);
        
        int month = Integer.parseInt(today.substring(4,6))*dateCount;
        System.out.println(month);
        
        int date = Integer.parseInt(today.substring(6,8));
        System.out.println(date);
        
        int totalToday = year+month+date;
        System.out.println(totalToday);
        
        for (String termType : terms) {
            String[] termSplit = termType.split(" ");
            termHash.put(termSplit[0], Integer.parseInt(termSplit[1]));
        }
        
        for(int i = 0; i< privacies.length; i++){
            String[] privacy = privacies[i].split(" ");
            String privacyDate = privacy[0].replace(".", "");
            String termType=privacy[1];
            
            int privacyYear = Integer.parseInt(privacyDate.substring(0, 4)) * monthCount * dateCount;
            int privacyMonth = Integer.parseInt(privacyDate.substring(4, 6)) * dateCount;
            int privacyDateNum = Integer.parseInt(privacyDate.substring(6, 8));
            
            // 만료일 계산 (-1 필요)
            int totalPrivacy = privacyYear + privacyMonth + privacyDateNum;
            int expiryDate = totalPrivacy + termHash.get(termType) * dateCount - 1;
            
            // 만료 여부 판단
            if (expiryDate < totalToday) {
                answerList.add(i + 1); // 인덱스 + 1
            }
        }
        Collections.sort(answerList);
        
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        
        return answer;
    }
}