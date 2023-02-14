class Solution {
    static int max = Integer.MAX_VALUE;
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        int[] dp = new int[y+1];
        dp[x] = 0;
        
        for(int i=x+1; i<=y; i++){
            int a = max, b=max, c=max, d;
            if(isDivided(i, 2) && above(x, i/2)) a = dp[i/2];
            if(isDivided(i, 3) && above(x, i/3)) b = dp[i/3];
            if(above(x, i-n)) c = dp[i-n];
            d = Math.min(a,b);
            d = Math.min(d,c);
            
            dp[i] = (d<max) ? d+1 : max;
            
        }
        answer = dp[y]<max ? dp[y] : -1;
        return answer;
    }
    
    // x보다 작으면 비교하지 않음
    private static boolean above(int x, int num){
        return(num>=x);
    }
    
    // (i/2) (i/3) (i-n)의 연산 결과가 자연수인지 확인
    private static boolean isDivided(int num, int divide){
        return (num/divide >0 && num % divide == 0);
    }
}