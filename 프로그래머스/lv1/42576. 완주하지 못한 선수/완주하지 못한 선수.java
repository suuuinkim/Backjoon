import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        // participant - completion
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        // System.out.println(map);
        
        for(int i=0; i<completion.length; i++){
            if(map.get(completion[i]) != 0){ // map에 담겨 있으면
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }
        
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}