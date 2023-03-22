import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeStr = before.toCharArray();
        char[] afterStr = after.toCharArray();
        
        Arrays.sort(beforeStr);
        Arrays.sort(afterStr);
        
        System.out.println(beforeStr);
        System.out.println(afterStr);
        
        String a = new String(beforeStr);
        String b = new String(afterStr);
        
        answer = a.equals(b) ? 1 : 0;
        
        return answer;
    }
}