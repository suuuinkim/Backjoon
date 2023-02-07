class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length == 0) return arr[0];
        
        int gcd = gcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1])/gcd;
        if(arr.length >2){
            for(int i=0; i<arr.length; i++){
                gcd = gcd(answer, arr[i]);
                answer = (answer * arr[i])/gcd;
            }
        }
        
        return answer;
    }
    
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}