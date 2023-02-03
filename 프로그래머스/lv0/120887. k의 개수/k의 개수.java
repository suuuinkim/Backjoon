class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int z = i; z<=j; z++){
            int tmp = z;
            while(tmp != 0){
                if(tmp%10 == k) answer++;
                tmp = tmp / 10;
            }
        }
        return answer;
    }
}