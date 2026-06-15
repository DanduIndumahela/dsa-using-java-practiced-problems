package Recursion.Backtracking;

public class Sudosolver {
    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        if (slover(board)) {
            display(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    static boolean slover(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyboard = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyboard = false;
                    break;
                }
            }
            if (emptyboard == false) {
                break;
            }
        }

        if (emptyboard == true) {
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if (issafe(board, row, col, number)) {
                board[row][col] = number;
                if (slover(board)) {
                    // display(board);
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean issafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) { // ✅ fixed (was board[row][col])
                return false;
            }
        }
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }
        int sqrt = (int) (Math.sqrt(board.length));
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;
        for (int ro = rowstart; ro < rowstart + sqrt; ro++) {
            for (int co = colstart; co < colstart + sqrt; co++) {
                if (board[ro][co] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
