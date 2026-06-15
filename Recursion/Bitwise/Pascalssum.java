package Recursion.Bitwise;

public class Pascalssum {
    public static void main(String[] args) {
        int n = 6; // row number
        System.out.println(sumOfRow(n)); // Output: 32
    }

    static int sumOfRow(int n) {
        return 1 << n; // 2^n using bit shift
    }
}
