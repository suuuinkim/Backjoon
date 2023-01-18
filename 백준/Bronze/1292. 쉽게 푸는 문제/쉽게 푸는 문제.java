import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<1000; i++){
            for(int j=0; j<=i; j++){
                list.add(i+1);
            }
        }

        int sum =0;
        for(int i=n-1; i<=m-1; i++){
            sum += list.get(i);
        }

        System.out.println(sum);

    }


}
