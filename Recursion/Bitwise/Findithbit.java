package Recursion.Bitwise;

public class Findithbit {
    public static void main(String[] args) {
        int n = 2; // binary: 110
        int i = 1; // position to check (1-based from right)

        int bitValue = bitt(n, i);
        System.out.println("The " + i + "-th bit of " + n + " is: " + bitValue);
    }

    static int bitt(int n, int i) {
        // Create mask with only the i-th bit set
        int mask = 1 << (i - 1);

        // Use bitwise AND to check the bit
        if ((n & mask) != 0) {
            return 1; // bit is set
        } else {
            return 0; // bit is not set
        }
    }
}
