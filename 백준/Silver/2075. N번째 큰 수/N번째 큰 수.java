import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int tmp = sc.nextInt();
            q.offer(tmp);
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp = sc.nextInt();

                if(q.peek() < tmp){
                    q.poll();
                    q.offer(tmp);
                }
            }
        }

        System.out.println(q.poll());
    }
}
