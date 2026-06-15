package Recursion.Bitwise;

public class Bitsinbasefornumber {
    public static void main(String[] args) {
        int n = 34567;
        int base = 10;
        int ans = (int) (Math.log(n) / Math.log(base) + (1));
        System.out.println(ans);
    }
}
