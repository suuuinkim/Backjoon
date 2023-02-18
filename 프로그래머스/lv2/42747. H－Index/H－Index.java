import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // 내림차순 정렬
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= i+1) answer++;
            
        }
        return answer;
    }
}