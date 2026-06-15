package Exception;

public class Morecatch {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        try {
            // int c = a / b;
            divide(a, b);
            // System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("execute always");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
