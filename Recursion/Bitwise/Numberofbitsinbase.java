package Recursion.Bitwise;

public class Numberofbitsinbase {
    public static void main(String[] args) {
        int n = 999999;
        System.out.println(bits(n));
    }

    static int bits(int n) {
        int count = 0;
        while (n > 0) {
            n = n >> 1;
            count++;
        }
        return count;
    }
}
