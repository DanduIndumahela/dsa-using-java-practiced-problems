import java.util.*;
public class Vowels {
        public static void main(String[] args) {
        System.out.println("Enter an alphabet: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // Ensure the input is a single character
        if (a.length() == 1) {
            char ch = a.toLowerCase().charAt(0); // Convert to lowercase for comparison
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel: " + a);
            } 
            // Check if it's a consonant (alphabet)
            else if (ch >= 'a' && ch <= 'z') {
                System.out.println("Consonant: " + a);
            } 
            else {
                System.out.println("Invalid input, please enter a valid alphabet.");
            }
        } else {
            System.out.println("Please enter only one alphabet.");
        }

        sc.close();
    }
}
