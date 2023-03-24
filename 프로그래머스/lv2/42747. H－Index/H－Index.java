import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // 내림차순
        
        //citations = Arrays.stream(citations).boxed()
        //.sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println(arr);
        
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= i + 1) answer++;
        }
        
        return answer;
    }
}