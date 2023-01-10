import java.util.*;
public class Main{
    public ArrayList<Integer> solution(int n, int k, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i =0; i<n; i++){
            if(nums[i] < k){
                answer.add(nums[i]);
            }
        }
        
        return answer;
        
    }
    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        
        for(int x : m.solution(n, k, nums)){
            System.out.print(x + " ");
        }
        
    }
}