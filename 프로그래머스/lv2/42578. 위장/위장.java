import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }
        
        
        int sum = 1;
        for(int x : map.values()){
            // System.out.println(x);
            sum *= x;
        }
        
        answer = sum - 1;
        return answer;
    }
}