import java.util.*;
public class Main {
    static int[] dy;
    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        dy = new int[n];
        dy[0] = 1;
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int answer = 1;

        for(int i =1; i<n; i++){
            int max = 0;
            for(int j = i-1; j>=0; j--){
                if(arr[j] < arr[i] && dy[j]>max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        System.out.println(answer);

        int value = answer;
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(value == dy[i]){
                stack.push(arr[i]);
                value--;
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
