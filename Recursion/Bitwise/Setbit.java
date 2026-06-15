package Recursion.Bitwise;

public class Setbit {
    public static void main(String[] args) {
        int n = 2; // binary: 10
        int i = 1; // position to set (1-based from right)
        System.out.println("Before: " + Integer.toBinaryString(n));
        int newNumber = setbit(n, i);
        System.out.println("After : " + Integer.toBinaryString(newNumber));
    }

    static int setbit(int n, int i) {
        int mask = 1 << (i - 1); // create mask for i-th bit
        return n | mask; // set the bit using OR
    }
}
