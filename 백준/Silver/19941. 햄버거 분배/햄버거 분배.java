import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        char[] x = new char[n];
        int[] arr = new int[n];

        int cnt = 0;
        for (char c : str.toCharArray()) x[cnt++] = c;

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] == 'P'){
                int lt = i - k;
                int rt = i + k;
                if(lt <= 0) lt = 0;
                if(rt >=n) rt = n-1;

                for(int j=lt; j<=rt; j++){
                    if(x[j] == 'H'){
                        answer++;
                        x[j] = 1;
                        break;
                    }
                }
            }
        }


        System.out.println(answer);
    }


}
