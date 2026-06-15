public class Pattern6 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}
