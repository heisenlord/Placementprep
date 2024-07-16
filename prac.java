import java.util.*;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> stack = new Stack<>();
        int k = 0;
        int max = 0;
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);

            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        max = Math.max((i - stack.peek()), max);
                    } else {
                        stack.push(i);
                    }
                }

            }
        }

        System.out.println(max);
    }

}
