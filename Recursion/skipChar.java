// package Recursion;

public class skipChar {
    public static void main(String[] args) {
        String s = "baccda";
        String res = "";

        res = skip(s, res, 0, 'a');
        System.out.println(res);

    }

    static String skip(String s, String res, int i, char c) {
        if (i > s.length() - 1) {
            return res;
        }
        if (s.charAt(i) != c) {
            res = res + s.charAt(i);
        }

        return skip(s, res, i + 1, c);

        // System.out.println(res);

    }
}
