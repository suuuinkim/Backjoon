import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(in.readLine());
            if(num == 0){
                if(!pq.isEmpty()) System.out.println(pq.poll());
                else System.out.println(0);
                continue;
            }
            pq.add(num);
        }
       
    }
}