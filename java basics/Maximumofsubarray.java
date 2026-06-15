/*53. Maximum Subarray*/
/*import java.util.Scanner;
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        // Try all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];  // Compute sum of subarray nums[i...j]
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Creating an object of Solution class
        Solution solution = new Solution();
        
        // Finding the maximum subarray sum
        int maxSum = solution.maxSubArray(nums);

        // Printing the result
        System.out.println("Maximum Subarray Sum: " + maxSum);

        sc.close();
    }
}
*/
/*import java.util.Scanner;

class Solution {
    public int maxSubArray(int[] nums) {
        return findMaxSubarray(nums, 0, nums.length - 1);
    }

    // Function to divide the array and find the maximum subarray sum
    private int findMaxSubarray(int[] nums, int left, int right) {
        // Base case: If only one element, return it
        if (left == right) {
            return nums[left];
        }

        // Find the middle index
        int mid = left + (right - left) / 2;

        // Recursively find the max sum in left half
        int leftMax = findMaxSubarray(nums, left, mid);

        // Recursively find the max sum in right half
        int rightMax = findMaxSubarray(nums, mid + 1, right);

        // Find max sum crossing the middle
        int crossMax = findMaxCrossingSum(nums, left, mid, right);

        // Return the maximum sum found
        return Math.max(leftMax, Math.max(rightMax, crossMax));
    }

    // Function to find max subarray sum that crosses the middle
    private int findMaxCrossingSum(int[] nums, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE, sum = 0;

        // Find max sum on the left side of mid
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        // Find max sum on the right side of mid
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        // Max sum that crosses the middle
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Creating an object of Solution class
        Solution solution = new Solution();
        
        // Finding the maximum subarray sum
        int maxSum = solution.maxSubArray(nums);

        // Printing the result
        System.out.println("Maximum Subarray Sum: " + maxSum);

        sc.close();
    }
}
*/