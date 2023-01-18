import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] arr = new Integer[10];
        Integer[] answer = new Integer[n];
        for(int j=0; j<n; j++){
            for(int i=0; i<10; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            answer[j] = arr[2];
        }

        for(int i=0; i<n; i++){
            System.out.println(answer[i]);
        }
    }


}
