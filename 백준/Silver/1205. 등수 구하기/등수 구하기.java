import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long score = sc.nextLong();
        int rank = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        if(n == rank && score <= arr[arr.length-1]){
            System.out.println(-1);
        }else{
            int answer = 1;

            for(int i=0; i<arr.length; i++){
                if(score < arr[i]){
                    answer++;
                }
            }
            System.out.println(answer);
        }



    }
}
