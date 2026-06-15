package Recursion.Bitwise;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 3;
        int anss = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                anss = anss * base;
            }
            base = base * base;
            power = power >> 1;
        }
        System.out.println(anss);
    }
}
