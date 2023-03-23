import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0; // 가지고 갈 수 있는 포켓몬의 개수 nums.length / 2
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        
        answer = nums.length/2 < map.size() ? nums.length/2 : map.size(); 
        return answer;
    }
}