package Recursion;

public class Printnumberss {
    public static void main(String[] args) {
        main(5);
    }

    static void main(int n) {
        if (n == 0) {
            return;
        }
        // System.out.print(n);
        main(n - 1);
        System.out.print(n);
    }
}
