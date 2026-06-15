package Recursion.Backtracking;

public class Pathbacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        pathrestrictions("", board, 0, 0);
    }

    static void pathrestrictions(String p, boolean[][] maze, int ro, int co) {
        if (ro == maze.length - 1 || co == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[ro][co] == false) {
            return;
        }
        maze[ro][co] = false;
        if (ro < maze.length - 1) {
            pathrestrictions(p + 'D', maze, ro + 1, co);
        }
        if (co < maze[0].length - 1) {
            pathrestrictions(p + 'R', maze, ro, co + 1);
        }
        if (ro > 0) {
            pathrestrictions(p + 'U', maze, ro - 1, co);
        }
        if (co > 0) {
            pathrestrictions(p + 'L', maze, ro, co - 1);
        }
        maze[ro][co] = true;
    }
}