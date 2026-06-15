public class Squareroot {
    public static void main(String[] args) {
        int n = 12;
        int p = 2;
        System.out.println(sqrt(n, p)); // fixed method call
    }

    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;

        // Binary search for integer part
        while (start <= end) { // fixed condition
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid < n) {
                root = mid; // store the best possible integer part
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Decimal part
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr; // step back one time
            incr /= 10;
        }

        return root;
    }
}
