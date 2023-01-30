import java.util.*;
public class Main {
    static long[][] dy = new long[100001][4];
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 연속해서 만들지 않게

        dy[1][1] = 1;
        dy[2][2] = 1;
        dy[3][1] = 1; // 2+1
        dy[3][2] = 1; // 1+2
        dy[3][3] = 1; // 3

        for(int i=4; i<=100000; i++){
            dy[i][1] = (dy[i-1][2] +dy[i-1][3]) % 1000000009;
            dy[i][2] = (dy[i-2][1] +dy[i-2][3]) % 1000000009;
            dy[i][3] = (dy[i-3][1] +dy[i-3][2]) % 1000000009;
        }

        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            System.out.println((dy[m][1] + dy[m][2] + dy[m][3]) % 1000000009);
        }


    }

}
