import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int d = gcd(n,m); // 최대공약수

        System.out.println(d);
        System.out.println(n*m / d);
    }
    
    public static int gcd(int n, int m){
        if(m == 0) return n;
        
        // GCD(a,b) = GCD(b,r)이므로 (r = a % b)
        return gcd(m, n%m);
    }
}
