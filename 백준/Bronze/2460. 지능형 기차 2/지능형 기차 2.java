import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int human = 0;
        int max = 0;
        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            human += k;
            human -= n;
            max = Math.max(human, max);

        }
        System.out.println(human + max);


    }
}
