import java.util.*;
public class Main{
    public static boolean[] prime;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        prime = new boolean[m+1];
        isPrime(n, m);

        int sum=0;
        int min = Integer.MIN_VALUE;
        for(int i=n; i<=m; i++){
            if(prime[i] == false) { //소수
                sum += i;
                if(min == Integer.MIN_VALUE){
                    min = i;
                }
            }
        }


        if(sum == 0){
            System.out.println(-1); // 소수가 없는 경우
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void isPrime(int n, int m){
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i] == true) continue;
            for(int j= i*i ; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}