import java.util.*;
public class Naturalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close(); // Closing scanner

        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNaturalNumbers(n));
    }
    static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2; // Using formula for sum of first n natural numbers
    }
    
}
