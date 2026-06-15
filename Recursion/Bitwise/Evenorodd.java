package Recursion.Bitwise;

public class Evenorodd {
    /*
     * public static void main(String[] args) {
     * int n = 99;
     * evenorodd(n);
     * // evenorodd(99);
     * }
     * 
     * static void evenorodd(int n) {
     * if ((n & 1) == 0) {
     * System.out.println("even");
     * } else {
     * System.out.println("odd");
     * }
     */
    public static void main(String[] args) {
        int n = 99;
        System.out.println(evenorodd(n));
    }

    static boolean evenorodd(int n) {
        return (n & 1) == 0;
    }
}
