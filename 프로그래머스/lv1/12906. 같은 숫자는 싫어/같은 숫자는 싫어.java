import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int x : arr){
            if(stack.isEmpty()) stack.push(x);  
            else if(!stack.isEmpty() && x != stack.peek()) stack.push(x);
            
        }
        
        
        int[] answer = new int[stack.size()];
        for(int i=0; i<stack.size(); i++){
            answer[i] = stack.get(i);
        }
        

        return answer;
    }
}