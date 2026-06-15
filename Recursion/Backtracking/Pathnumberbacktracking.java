package Recursion.Backtracking;

import java.util.Arrays;

public class Pathnumberbacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        int[][] path = new int[board.length][board[0].length];
        pathrestrictions("", board, 0, 0, path, 1);

    }

    static void pathrestrictions(String p, boolean[][] maze, int ro, int co, int[][] path, int step) {
        if (ro == maze.length - 1 || co == maze[0].length - 1) {
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if (maze[ro][co] == false) {
            return;
        }
        maze[ro][co] = false;
        path[ro][co] = step;
        if (ro < maze.length - 1) {
            pathrestrictions(p + 'D', maze, ro + 1, co, path, step + 1);
        }
        if (co < maze[0].length - 1) {
            pathrestrictions(p + 'R', maze, ro, co + 1, path, step + 1);
        }
        if (ro > 0) {
            pathrestrictions(p + 'U', maze, ro - 1, co, path, step + 1);
        }
        if (co > 0) {
            pathrestrictions(p + 'L', maze, ro, co - 1, path, step + 1);
        }
        maze[ro][co] = true;
    }
}