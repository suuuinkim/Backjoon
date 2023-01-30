import java.util.*;
public class Main {
    static long[] dy = new long[10000001];
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dy[1] = 1;
        dy[2] = 2;
        dy[3] = 4;

        for(int i=4; i<=1000000; i++){
            dy[i] = (dy[i-3] + dy[i-2] + dy[i-1]) % 1000000009;
        }

        for(int i=0; i<n; i++){
            //int m = sc.nextInt();
            System.out.println(dy[sc.nextInt()]);
        }



    }

}
