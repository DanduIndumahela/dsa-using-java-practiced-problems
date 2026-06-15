package Recursion.Bitwise;

public class Powerofnumber {
    public static void main(String[] args) {
        int n = 34;
        /*
         * int count = 0;
         * while (n > 0) {
         * int last = n & 1;
         * n = n >> 1;
         * if (last == 1) {
         * count++;
         * }
         * }
         * if (count != 1) {
         * System.out.println("false");
         * } else {
         * System.out.println("true");
         * }
         */
        boolean anss = (n & (n - 1)) == 0;
        System.out.println(anss);
    }
}
