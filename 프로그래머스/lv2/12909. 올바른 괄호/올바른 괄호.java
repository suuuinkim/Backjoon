import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(') stack.push(c);
            else{
                if(!stack.isEmpty()) stack.pop();
                else stack.push(c);
            }    
        }
        
        answer = stack.isEmpty() ? true : false;
        return answer;
    }
}