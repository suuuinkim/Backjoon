import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        int sum = 0;
        for(int i = 0; i<m; i++){
            sum += arr[i];
        }

        int max = sum;
        int cnt = 1;
        // System.out.println(sum);
        for(int i=m; i<n; i++){
            sum += arr[i];
            sum -= arr[i-m];

            if(max < sum){
                cnt = 1;
                max = sum;
            }else if(max == sum) {
                //cnt = 1;
                cnt++;
            }

        }

        if(max == 0){
            System.out.println("SAD");
            return;
        }
        else {
            System.out.println(max);
            System.out.println(cnt);
        }

    }
}
