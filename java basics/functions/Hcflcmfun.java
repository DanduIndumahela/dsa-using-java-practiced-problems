package basics.functions;
import java.util.Scanner;

public class Hcflcmfun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        // Find HCF and LCM
        int hcf = findHCF(a, b);
        int lcm = findLCM(a, b, hcf);
        
        // Output results
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        
        sc.close(); // Close scanner
    }
    
    // Method to find HCF
    static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // Remainder
            a = temp;
        }
        return a;  // Return the HCF
    }

    // Method to find LCM
    static int findLCM(int a, int b, int hcf) {
        return (a * b) / hcf;  // LCM formula
    }
}
