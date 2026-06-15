package Recursion.Bitwise;

public class Reset {
    public static void main(String[] args) {
        int n = 6; // binary: 110
        int i = 6; // clear the 2nd bit (from right)

        System.out.println("Original: " + Integer.toBinaryString(n));
        int resett = reset(n, i);
        System.out.println("After reset: " + Integer.toBinaryString(resett));
    }

    static int reset(int n, int i) {
        int mask = ~(1 << (i - 1)); // all 1s except i-th bit
        return n & mask; // AND to clear i-th bit
    }
}
