import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isarmstrong(n);
        System.out.println(ans);//System.out.println(isarmstrong(n));
    }

    static boolean isarmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;  // Get the last digit
            n = n / 10;        // Remove the last digit
            sum = sum + rem * rem * rem;  // Add the cube of the digit to sum
        }
        if(sum == original){//return sum==original;
            return true;
        }
        return false;
    }
}
