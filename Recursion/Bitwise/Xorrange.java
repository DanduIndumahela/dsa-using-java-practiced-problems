package Recursion.Bitwise;

public class Xorrange {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        int anss = xor(b) ^ xor(a - 1);
        System.out.println(anss);
    }

    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
