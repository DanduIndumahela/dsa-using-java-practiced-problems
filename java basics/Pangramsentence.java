import java.util.*;

public class Pangramsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a sentence to check if it's a pangram:");
        String n = sc.nextLine();

        // Directly calling the static method without creating an object
        if (checkIfPangram(n)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is NOT a pangram.");
        }
        sc.close(); // Closing the scanner
    }
    // Method to check if the sentence is a pangram
    static boolean checkIfPangram(String sentence) {
        ArrayList<Character> alphabetList = new ArrayList<>();
        sentence = sentence.toLowerCase(); // Convert to lowercase for uniformity

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // Check if character is between 'a' and 'z'
            if (c >= 'a' && c <= 'z') {
                // Add only unique characters to the list
                if (!alphabetList.contains(c)) {
                    alphabetList.add(c);
                }
            }
        }
        // If list has all 26 letters, it's a pangram
        return alphabetList.size() == 26;
    }
}
