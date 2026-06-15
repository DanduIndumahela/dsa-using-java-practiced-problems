/*package Recursion;

public class Count {
    public static void main(String[] args) {
        int count = countt(30209, 0);
        System.out.println(count);
    }

    static int countt(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return countt(n / 10, count + 1);
        } else {
            return countt(n / 10, count);
        }
    }
}*/
package Recursion;

public class Count {
    public static void main(String[] args) {
        System.out.println(countt(30209));
    }

    static int countt(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
