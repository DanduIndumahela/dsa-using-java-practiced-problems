import java.util.*;

public class Uniquevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n]; // 1D array
        
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Removing duplicates in-place
        if (n == 0) {
            System.out.println("Number of unique elements: 0");
            return;
        }

        int index = 1; // Pointer for unique elements
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) { // If a new unique element is found
                nums[index] = nums[i];
                index++;
            }
        }

        System.out.println("Number of unique elements: " + index);

        // Print the unique values in the modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
        
        sc.close();
    }
}
