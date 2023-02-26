import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int i=0; i<n; i++){
            int idx = arr[i]; // 2, 1, 1, 0

            for(int j=0; j<n; j++){
                if(idx ==0 && answer[j] == 0){
                    answer[j] = i+1;
                    break;
                }else if(answer[j
                        ] == 0) idx--;
            }
        }

        for (int x : answer){
            System.out.print(x + " ");
        }
    }
}
