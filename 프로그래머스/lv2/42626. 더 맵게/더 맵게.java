import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++) q.add(scoville[i]);
        
        
        while(q.peek() < K && q.size() >1){
            
            int a = q.poll();
            int b = q.poll();
            int mix = a + (b*2);
            q.add(mix);
            answer++;
        }
        
        if(q.peek() < K && q.size() <= 1) return -1;
        return answer;
    }
}