import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();

            /*for(char x : s.toCharArray()){
                stack.push(x);
            }*/

        int answer = 0;
        int value = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                value *= 2;
            } else if (s.charAt(i) == '[') {
                stack.push('[');
                value *= 3;
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    answer = 0;
                    break;
                } else if(s.charAt(i-1) == '(') answer += value;

                stack.pop();
                value /= 2;
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    answer = 0;
                    break;
                } else if (s.charAt(i-1) == '[') answer += value;
                stack.pop();
                value /= 3;
            }

        }

        if(!stack.isEmpty()) System.out.println(0);
        else System.out.println(answer);
    }
}