package basics.functions;
import java.util.*;

public class Operatoriffun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // Take inputs for the numbers and operator
        int a = getInput(sc, "Enter first number:");
        int b = getInput(sc, "Enter second number:");
        
        // Consume the leftover newline character after the integers
        sc.nextLine();
        
        String op = getOperator(sc, "Enter operator (+, -, *, /, %):");
    
        // Perform the operation based on the operator
        int result = performOperation(a, b, op);
    
        // Print the result
        printResult(result);
        
        sc.close();  // Close the scanner
    }
    
    // Method to take numeric input
    public static int getInput(Scanner sc, String message) {
        System.out.println(message);
        return sc.nextInt();
    }
    
    // Method to get the operator as input
    public static String getOperator(Scanner sc, String message) {
        System.out.println(message);
        return sc.nextLine();  // Read the operator
    }
    
    // Method to perform the operation based on the operator
    public static int performOperation(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    result = Integer.MIN_VALUE;  // Return an error code
                }
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Invalid operator");
                result = Integer.MIN_VALUE;  // Return an error code for invalid operator
        }
        return result;
    }
    
    // Method to print the result of the operation
    public static void printResult(int result) {
        if (result != Integer.MIN_VALUE) {
            System.out.println("Result: " + result);
        }
    }
}
