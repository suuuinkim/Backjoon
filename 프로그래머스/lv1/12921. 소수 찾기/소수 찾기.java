class Solution {
    public static boolean[] prime;
    
    public int solution(int n) {
        int answer = 0;
        
        prime = new boolean[n+1];
        isPrime(n);
        
        for(int i=0; i<=n; i++){
            if(prime[i] == false) answer++;
        }
        
        return answer;
    }
    
    public static void isPrime(int n){
        prime[0] = prime[1] = true;
        for(int i=2 ; i<= Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i*i; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}