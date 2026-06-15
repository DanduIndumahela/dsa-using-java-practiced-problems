package Recursion.Backtracking;

public class Knightsproblem {
    public static void main(String[] args) {
        int n = 6;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 5);
    }

    static void knight(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knight);
            return;
        }

        if (issafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knight);
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        if (isvalid(board, row - 2, col - 1) && board[row - 2][col - 1])
            return false;
        if (isvalid(board, row - 1, col - 2) && board[row - 1][col - 2])
            return false;
        if (isvalid(board, row - 2, col + 1) && board[row - 2][col + 1])
            return false;
        if (isvalid(board, row - 1, col + 2) && board[row - 1][col + 2])
            return false;
        return true;
    }

    static boolean isvalid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
