import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        //트럭은 1초에 다리 길이 1씩 전진한다.
        //트럭은 올라갈수 있으면 1초에 한 대씩 다리에 올라갈 수 있다
        //bridge_length만큼 다리 올라 갈 수 있다
        //weight까지 버틸 수 있음, truck_weights는 대기 트럭 무게
        
        int time = 0;       // 경과 시간 (반환할 값)
        int currentWeight = 0; // 다리 위의 현재 무게
        int truckIndex = 0;  // 대기 트럭 배열의 인덱스
        
        Queue<Integer> bridge = new LinkedList<>();
        
        while(truckIndex < truck_weights.length || !bridge.isEmpty()){
            time++;
            
            // 다리에서 트럭 내리기 (시간 체크)
            if (!bridge.isEmpty() && time >= bridge.peek()) {
                bridge.poll();
                //무게 빼기
                currentWeight -= truck_weights[truckIndex - bridge.size() -1];
                // truckIndex - bridge.size()로 하는 경우, 마지막 트럭에서 인덱스 오류 발생.
                // 마지막 트럭이 내려올 때 truckIndex는 이미 truck_weights.length와 같아짐.
            }

            // 다리에 트럭 올리기 (무게와 길이 체크)
            if (truckIndex < truck_weights.length &&
                currentWeight + truck_weights[truckIndex] <= weight &&
                bridge.size() < bridge_length) {

                bridge.offer(time + bridge_length);  // 다리를 건너는 데 걸리는 시간을 큐에 추가
                currentWeight += truck_weights[truckIndex];
                truckIndex++;
            }
        }

        return time;
    }
}
