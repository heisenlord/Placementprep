// package STACK

import java.util.Arrays;
import java.util.Stack;

// &QUEUE.STACK;

public class st {
    public static void main(String[] args) {

        int[] a = { 5, 4, 10 };
        int[] b = { 4, 2, 4, 6, 1 };
        int ans = stackprob(10, a, b, 0, 0);
        System.out.println(ans);

    }

    static int stackprob(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) {
            return count - 1;
        }
        if (a.length == 0 || b.length == 0) {
            return count;

        }
        int a1 = stackprob(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int a2 = stackprob(x, Arrays.copyOfRange(b, 1, a.length), b, sum + b[0], count + 1);
        return Math.max(a1, a2);
    }

}
