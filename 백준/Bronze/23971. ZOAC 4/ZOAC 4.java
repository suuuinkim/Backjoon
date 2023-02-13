import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;

        int a = (h -1)/(n+1) + 1;
        int b = (w -1)/(m+1) + 1;

        System.out.println(a*b);
    }
}
