import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        // String[] arr = new String[n];

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            set.add(sc.next());

        }


        // System.out.println(set.size());
        switch (c){
            case 'Y' :
                System.out.print(set.size());
                break;
            case 'F' :
                System.out.print(set.size()/2);
                break;
            case 'O' :
                System.out.print(set.size()/3);
                break;
        }
    }
}
