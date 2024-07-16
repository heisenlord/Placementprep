import java.util.*;

public class SubSeq {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println(subseq("", "abc"));

        // ArrayList<String> list = new ArrayList<>();
        // list.add("a");
        // list.add("b");

        // ArrayList<String> list2 = new ArrayList<>();
        // list2.addAll(list);

    }

    static ArrayList<String> subseq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char c = up.charAt(0);
        ArrayList<String> left = subseq(p + c, up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));
        left.addAll(right);
        System.out.println("left" + left);
        System.out.println("right" + right);
        return left;

    }

}
