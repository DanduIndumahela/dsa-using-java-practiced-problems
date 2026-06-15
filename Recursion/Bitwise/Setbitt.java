package Recursion.Bitwise;

public class Setbitt {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbitt(n));
    }

    static int setbitt(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            // n = n - (n & -n);
            n = n & (n - 1);
        }
        return count;
    }
}
