import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String x = Integer.toString(n, k);
        
        String[] arr = x.split("0");
        
        for(String str : arr){
            if(str.equals(""))continue;
            Long num = Long.parseLong(str);
            if(isPrime(num) == false) answer++;
        }
        return answer;
    }
    
    // 소수확인 메소드
    public static boolean isPrime(Long n){
        if(n<2) return true; // 소수아님
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return true; // 소수아님
        }
        
        return false;
    }
}