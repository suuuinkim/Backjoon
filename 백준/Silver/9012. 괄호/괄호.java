import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println(m.solution(sc.next()));
        }
    }

    public String solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            }

            else if (stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }


        if (stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}