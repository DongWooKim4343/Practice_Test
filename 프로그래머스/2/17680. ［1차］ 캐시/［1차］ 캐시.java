import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int hit = 1;
        int miss = 5;
        
        LinkedHashSet<String> cacheSet = new LinkedHashSet<>();
        
        if(cacheSize ==0){
            return cities.length*miss;
        }
        
        for(String c : cities){
            String city = c.toUpperCase();
            if(cacheSet.contains(city)){
                answer+=hit;
                cacheSet.remove(city); //최근 사용된 데이터 갱신하는 작업
                cacheSet.add(city); //지우고 다시 추가해줌으로써 갱신
            }else{
                answer+=miss;
                if(cacheSet.size()==cacheSize){
                    // 가장 오래된 페이지 제거 LinkedHashSet의 첫 번째 요소
                    String first = cacheSet.iterator().next();  // 가장 오래된 항목 
                    cacheSet.remove(first);
                }
                cacheSet.add(city);
            }
        }
        
        return answer;
    }
}