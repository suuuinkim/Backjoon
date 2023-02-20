import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        long k = sc.nextInt(); // 최대예산
        long left = 0;
        long right = arr[n-1];

        long answer = 0;
        while(left<=right){
            long mid = (left+right)/2; // 내야되는 세금
            long sum = 0;
            for(int money : arr){
                if(money >= mid) sum += mid;
                else sum += money;
            }
            if(sum > k) right = mid -1;
            else{
                left = mid+1;
                answer = Math.max(answer, mid);
            }

        }

        System.out.println(answer);

    }


}
