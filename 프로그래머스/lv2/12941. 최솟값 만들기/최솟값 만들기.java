import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        //Integer[] arr = Arrays.stream(B).boxed().toArray(Integer[]::new);
        //Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++){
            answer += A[i]*B[B.length - 1 -i];
        }
        

        return answer;
    }
}