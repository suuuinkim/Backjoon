class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr=s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(Integer.parseInt(arr[i]), min);
            max = Math.max(Integer.parseInt(arr[i]), max);
        }
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        
        return answer;
    }
}