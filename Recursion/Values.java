package Recursion;

public class Values {
    public static void main(String[] args) {
        values(5);
    }

    static void values(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // values(--n);
        values(n--);
    }
}
