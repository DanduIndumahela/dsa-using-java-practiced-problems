/*1470. Shuffle the Array*/
import java.util.*;

public class Shufflearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the value of n
        int n = sc.nextInt();
        int nums[] = new int[n];

        // Read input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int x = n / 2; // Correct way to determine 'x' for shuffling

        // Print original array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(); // New line

        // Call shuffle and print result
        int[] result = shuffle(nums, x);
        System.out.println(Arrays.toString(result)); // Print array correctly
    }

    static int[] shuffle(int num[], int x) { // Fixed missing data type for 'x'
        int[] output = new int[num.length]; // Correct array size
        int index = 0;

        for (int i = 0; i < x; i++) { // Use 'x' instead of 'n'
            output[index++] = num[i];
            output[index++] = num[i + x]; // Use 'x' instead of 'n'
        }

        return output;
    }
}
