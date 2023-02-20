class Solution {
    public String solution(String s) {
        String answer = "";
        //s = s.toLowerCase();
        String[] str = s.toLowerCase().split(" ");
        
        for(String x : str){
            if(x.length() > 0)
                answer += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            else answer += " ";
        }
        if(s.charAt(s.length()-1) != ' ') answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}