package BACKTRACKING;

public class Maze_path {
    public static void main(String[] args) {
        int n = 3;
        path(n, n, "");
    }

    static void path(int r, int c, String p) {

        if (r == 1 && c == 1) {
            System.out.println(p);
            return;

        }
        if (r > 1) {
            path(r - 1, c, p + "d");
        }
        if (c > 1) {
            path(r, c - 1, p + "r");
        }
    }

}
