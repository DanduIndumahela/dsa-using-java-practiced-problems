package Exception;

public class Exceptionenhanced {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("arthimatic exception");
        } finally {
            System.out.println("execute always");
        }
    }
}
