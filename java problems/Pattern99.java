public class Pattern99 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;

            // Print leading spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }
    }
}
