import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int answer = 0;
        int len = str.length();
        
        int x = Integer.parseInt(str);
        
        for(int i=(x-(len*9)); i<x; i++){
            
            int num = i;
            int sum = 0;
            
            while(num != 0){
                sum += num%10;
                num /= 10;
            }
            
            if(sum + i == x){
                answer = i;
                break;
            }
        }
        System.out.println(answer);        
    }
}