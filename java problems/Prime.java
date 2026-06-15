import java.util.*;
public class Prime { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // Close Scanner

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;  // Numbers <= 1 are not prime
        if (n == 2) return true;   // 2 is the smallest prime number
        if (n % 2 == 0) return false; // Even numbers >2 are not prime

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;  // If divisible, not prime
            }
        }
        return true;  // Otherwise, prime
    }
}


