import java.io.*;
import java.util.*;
public class Main {
    static int n, k;
    static StringBuilder sb = new StringBuilder();
    static int[][] dy = new int[10001][4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dy[1][1] = 1;
        dy[1][2] = 0;
        dy[1][3] = 0;

        dy[2][1] = 1;
        dy[2][2] = 1;
        dy[2][3] = 0;

        dy[3][1] = 1;
        dy[3][2] = 1;
        dy[3][3] = 1;

        for(int i=4; i<=10000; i++){
            dy[i][1] = dy[i-1][1];
            dy[i][2] = dy[i-2][1] + dy[i-2][2];
            dy[i][3] = dy[i-3][1] + dy[i-3][2] + dy[i-3][3];
        }

        n = Integer.parseInt(br.readLine());

        while(n-->0){
            k = Integer.parseInt(br.readLine());
            int sum = dy[k][1] + dy[k][2] + dy[k][3];
            sb.append(sum + "\n");
        }

        System.out.println(sb);


    }
}
