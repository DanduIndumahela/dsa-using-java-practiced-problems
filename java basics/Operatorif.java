package basics;
import java.util.*;

public class Operatorif {
    public static void main(String[] args) {
        System.out.println("Enter a, b numbers");
        Scanner sc = new Scanner(System.in);

        // Take inputs for the numbers
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        // Consume the leftover newline character
        sc.nextLine(); 

        // Take input for the operator
        System.out.println("Enter operator (+, -, *, /, %):");
        String op = sc.nextLine();  // Read the operator

        // Perform operation based on the operator
        if (op.equals("+")) {
            System.out.println(a + b);
        } else if (op.equals("-")) {
            System.out.println(a - b);
        } else if (op.equals("*")) {
            System.out.println(a * b);
        } else if (op.equals("/")) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else if (op.equals("%")) {
            System.out.println(a % b);
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();  // Close the scanner
    }
}
