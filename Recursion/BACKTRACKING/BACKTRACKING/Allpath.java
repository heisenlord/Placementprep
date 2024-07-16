//package BACKTRACKING;

public class Allpath {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // int[][] path = new int[board.length][board[0].length];
        allPath("", board, 0, 0);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + "d", maze, r + 1, c);

        }
        if (c < maze[0].length - 1) {
            allPath(p + "r", maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + 'u', maze, r - 1, c);

        }
        if (c > 0) {
            allPath(p + 'l', maze, r, c - 1);

        }

        maze[r][c] = true;
    }

}
