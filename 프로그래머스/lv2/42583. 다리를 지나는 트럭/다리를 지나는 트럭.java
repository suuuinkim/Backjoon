import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        
        for(int i=0; i<truck_weights.length; i++){
            int truck = truck_weights[i];
            while(true){
                // 1. 트럭이 다리에 한 대도 없을 때
                if(q.isEmpty()){
                    q.offer(truck);
                    sum += truck;
                    answer++;
                    break;
                // 2. 트럭이 다리 길이 만큼 있을 때
                }else if(q.size() == bridge_length) {
                    sum -= q.poll();
                }else{
                    // 3. 다리에 트럭이 있고 무게가 weight 보다 적을 떄
                    if(sum + truck<= weight){
                        q.offer(truck);
                        sum += truck;
                        answer++;
                        break;
                    // 4. 다리에 트럭이 있고 무게가 weight 보다 클 때
                    }else{
                        q.offer(0);
                        answer++;
                        
                    }
                }
            }
        }
        
        answer += bridge_length;
        return answer;
    }
}