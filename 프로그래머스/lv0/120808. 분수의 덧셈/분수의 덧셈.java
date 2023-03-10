class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        
        int mod = gcd(numer, denom);
        
        numer/=mod;
        denom/=mod;
        
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
    
    public static int gcd(int a, int b){
        // a가 b보다 큰 경우에 대해서 유클리드 호제법 수행
        if(a<=b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}