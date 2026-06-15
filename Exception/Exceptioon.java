package Exception.Compareexception;

public class Exceptioon {
    public static void main(String[] args) {
        // Case 1: Custom exception
        try {
            String name = "indu";
            if (name.equals("indu")) {
                throw new Creatingnewexception("Custom Exception: name is indu");
            }
        } catch (Creatingnewexception e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught some other exception");
        } finally {
            System.out.println("Case 1: finally always executes\n");
        }

        // Case 2: ArithmeticException
        try {
            int a = 9;
            int b = 0;
            int result = divide(a, b);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Case 2: finally always executes\n");
        }
        // Case 3: Normal execution (no exception)
        try {
            int a = 10;
            int b = 2;
            int result = divide(a, b);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Case 3: finally always executes");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
