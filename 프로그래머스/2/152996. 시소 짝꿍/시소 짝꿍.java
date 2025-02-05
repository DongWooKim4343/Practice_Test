import java.util.HashMap;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        double[] ratio = {2.0 / 4.0, 3.0 / 4.0, 2.0 / 3.0, 4.0 / 3.0, 2.0 / 2.0, 3.0 / 2.0, 4.0 / 2.0};

        HashMap<Integer, Integer> weightCount = new HashMap<>();
        for (int weight : weights) {
            weightCount.put(weight, weightCount.getOrDefault(weight, 0) + 1);
        }

        for (int weight : weights) {
            // 자기 자신과의 비교는 제외
            weightCount.put(weight, weightCount.get(weight) - 1);

            for (double r : ratio) {
                double targetWeight = weight * r;
                // targetWeight가 정수인지 확인하고, HashMap에서 찾기
                if (targetWeight == (int) targetWeight && weightCount.containsKey((int) targetWeight)) {
                    answer += weightCount.get((int) targetWeight);
                }
            }
        }

        return answer;
    }
}