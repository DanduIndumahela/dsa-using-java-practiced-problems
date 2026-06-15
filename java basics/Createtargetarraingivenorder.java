/*1389. Create Target Array in the Given Order*/
/*import java.util.ArrayList;
import java.util.Scanner;

public class Createtargetarraingivenorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        // Initialize arrays
        int[] nums = new int[n];
        int[] index = new int[n];

        // Input nums array
        System.out.println("Enter elements in nums:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input index array
        System.out.println("Enter elements in index:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        // Call the method to create target array
        int[] target = createtarget(nums, index);

        // Print the final target array
        System.out.print("Target Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(target[i] + " ");
        }
        System.out.println();
    }

    // Made the method static
    public static int[] createtarget(int[] nums, int[] index) {
        ArrayList<Integer> targetlist = new ArrayList<>();

        // Insert elements at specific positions
        for (int i = 0; i < nums.length; i++) {
            targetlist.add(index[i], nums[i]);
        }

        // Convert ArrayList to array
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            target[i] = targetlist.get(i);
        }

        return target;
    }
}
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Createtargetarraingivenorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        // Initialize arrays
        int[] nums = new int[n];
        int[] index = new int[n];

        // Input nums array
        System.out.println("Enter elements in nums:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input index array
        System.out.println("Enter elements in index:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        // Call the method to create target ArrayList
        ArrayList<Integer> targetList = createtarget(nums, index);

        // Print the final target list directly
        System.out.print("Target Array: ");
        for (int num : targetList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method returns ArrayList directly
    public static ArrayList<Integer> createtarget(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();

        // Insert elements at specific positions
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        return targetList;
    }
}
