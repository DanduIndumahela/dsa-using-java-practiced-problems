public class Vowelsconsonents {
    public static void main(String[] args) {
        vowelsConsonents(); // Method call
    }
    static void vowelsConsonents() {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; // Array of vowels
        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0;
            // Check if current letter 'i' is a vowel
            for (int j = 0; j < vowels.length; j++) {
                if (i == vowels[j]) {
                    count++;  // matched with a vowel
                }
            }
            // Print result
            if (count > 0) {
                System.out.println(i + " is a Vowel");
            } else {
                System.out.println(i + " is a Consonant");
            }
        }
    }
}
