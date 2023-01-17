import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int sum = 0;
        int fake1 = 0, fake2=0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(sum - arr[i] - arr[j] == 100){
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        for(int k=0; k<arr.length; k++){
            if(k == fake1 || k == fake2) continue;
            System.out.println(arr[k]);
        }

    }
}
