package SUBSETS;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        permutat("", "abc");
    }

    static ArrayList<String> permutat(String p, String string) {
        if (string.isEmpty()) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);// Print the permutation
            return ls;
        }
        char c = string.charAt(0);
        ArrayList<String> ans = new ArrayList<>(); // Print the permutation

        for (int i = 0; i <= p.length(); i++) {
            String str = p.substring(0, i) + c + p.substring(i, p.length());
            ans.addAll(permutat(str, string.substring(1)));

        }
        return ans;
    }
}
