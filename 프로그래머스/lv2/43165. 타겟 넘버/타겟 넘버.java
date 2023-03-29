import java.util.*;
class Solution {
    static int[] numbers;
    static int target;
    static int answer;
    public void DFS(int L, int sum){
        // System.out.println(L + " : " + sum);
        // 수행종료
        if(L == numbers.length){
            if(sum == target) answer++;
            return;
        }
        // 수행코드
        DFS(L + 1, sum + numbers[L]);
        DFS(L + 1, sum - numbers[L]);
    }
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        answer = 0;
        
        DFS(0, 0);
        return answer;
    }
}