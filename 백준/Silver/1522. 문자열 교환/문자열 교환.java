import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int min = Integer.MAX_VALUE;
        int acnt = 0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a') acnt++;
        }
        
        for(int i=0; i<str.length(); i++){
            int bcnt = 0;
            for(int j=i; j<acnt+i; j++){
                if(str.charAt(j % str.length()) == 'b') bcnt++;
            }
            min = Math.min(min, bcnt);
        }
        
        System.out.println(min);
    }
}