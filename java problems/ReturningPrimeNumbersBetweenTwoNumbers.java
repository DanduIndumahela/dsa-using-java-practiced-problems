/*Write a function that returns all prime numbers between two given numbers. */
import java.util.Scanner;

public class ReturningPrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close(); // Closing scanner to prevent memory leak

        System.out.println("Prime numbers between " + a + " and " + b + " are:");
        printingPrimeNumbers(a, b);
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        int c = 2;
        while (c * c <= num) {  // Check divisibility up to sqrt(num)
            if (num % c == 0) {
                return false; // If divisible, it's not prime
            }
            c++;
        }
        return true;
    }

    // Function to print all prime numbers between two given numbers
    static void printingPrimeNumbers(int a, int b) {
        int num = a;
        while (num <= b) { // Iterate from a to b
            if (isPrime(num)) { // If prime, print it
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
