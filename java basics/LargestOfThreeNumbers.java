import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        // Finding the largest number
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);

        // Closing scanner
        sc.close();
    }
}
