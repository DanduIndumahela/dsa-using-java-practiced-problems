package Recursion.Arrayrecursion;

public class Rectanglepattern {
    public static void main(String[] args) {
        equilateral(5, 0);
    }

    static void equilateral(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            equilateral(row, col + 1);
        } else {
            System.out.println();
            equilateral(row - 1, 0);
        }
    }
}
