import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[4][4];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i][1] != 0) sum +=3;
            if(arr[i][2] != 0) sum +=2;
            if(arr[i][3] != 0) sum +=1;

            map.put(arr[i][0], sum);
            sum = 0;
        }

        System.out.println(map.get(k));

    }
}