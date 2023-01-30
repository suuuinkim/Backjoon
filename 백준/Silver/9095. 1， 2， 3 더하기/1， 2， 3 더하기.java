import java.util.*;
public class Main {
    static int[] dy = new int[11];
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dy[1] = 1;
        dy[2] = 2;
        dy[3] = 4;

        for(int i=4; i<=10; i++){
            dy[i] = dy[i-3] + dy[i-2] + dy[i-1];
        }

        for(int i=0; i<n; i++){
            int m = sc.nextInt();

            System.out.println(dy[m]);
        }



    }

}
