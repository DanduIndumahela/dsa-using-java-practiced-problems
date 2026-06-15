import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    // Function to check if a number is a palindrome
    static boolean isPalindrome(int n) {
        int original = n;  // Store the original number
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10;       // Extract the last digit
            reversed = reversed * 10 + digit;  // Build the reversed number
            n = n / 10;               // Remove the last digit
        }
        
        return original == reversed;  // Check if original and reversed are equal
    }
}

    
