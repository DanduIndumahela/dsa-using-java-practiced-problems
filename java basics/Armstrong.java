import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take two numbers as input for the range
        System.out.println("Enter the first number:");
        int start = sc.nextInt();
        System.out.println("Enter the second number:");
        int end = sc.nextInt();

        // Loop through the range of numbers
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int num = start; num <= end; num++) {
            int originalNumber = num;
            int sum = 0;
            int numberOfDigits = String.valueOf(num).length();  // Find the number of digits

            // Calculate the sum of the digits raised to the power of the number of digits
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, numberOfDigits);  // Raise the digit to the power
                num /= 10;
            }

            // Check if the sum equals the original number
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }

            num = originalNumber;  // Restore the number to continue the next iteration
        }

        sc.close();  // Close the scanner
    }

    
}
