import java.util.*;

public class Main{
    public int solution(int n, int[] nums, int v){
        int cnt = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i] == v) cnt++;
        }
        
        return cnt;
    }
    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        
        System.out.println(m.solution(n, nums, v));
        
        
    }
}