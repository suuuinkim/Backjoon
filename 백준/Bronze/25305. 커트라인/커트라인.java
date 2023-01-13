import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] nums = new Integer[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        // 내림차순 정렬
        Arrays.sort(nums, Collections.reverseOrder());

        int cnt = 0;
        for(int x : nums){
            cnt++;
            if(cnt == k) System.out.println(x);
        }
    }
}