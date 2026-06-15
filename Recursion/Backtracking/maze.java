package Recursion.Backtracking;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    static int count(int ro, int co) {
        if (ro == 1 || co == 1) {
            return 1;
        }
        int left = count(ro - 1, co);
        int right = count(ro, co - 1);
        return left + right;
    }
}
