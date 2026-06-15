/*989. Add to Array-Form of Integer*/
import java.util.*;

public class Arraysum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for num array and k
        System.out.println("Enter the array (separate digits by space):");
        String input = sc.nextLine();
        String[] numStr = input.split(" ");
        
        List<Integer> num = new ArrayList<>();
        for (String str : numStr) {
            num.add(Integer.parseInt(str));
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        
        List<Integer> result = addToArrayForm(num, k);
        
        // Print the result
        System.out.println(result);
    }
    
    public static List<Integer> addToArrayForm(List<Integer> num, int k) {
        int carry = k;
        List<Integer> result = new ArrayList<>();
        
        // Traverse the list from the last digit (rightmost) towards the left
        for (int i = num.size() - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num.get(i);  // Add the current digit from num to carry
            }
            
            result.add(0, carry % 10);  // Add the last digit of the carry to the result
            carry /= 10;  // Update carry by dividing by 10
        }
        
        return result;
    }
}

