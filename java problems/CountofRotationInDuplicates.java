public class CountofRotationInDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 5, 6, 0, 1, 2, 2};
        System.out.println(countOfRotationInDuplicates(arr));  // Output: 5
    }

    static int countOfRotationInDuplicates(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Case 1: pivot condition
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 2: if elements at start, mid, end are equal → skip duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (start < nums.length - 1 && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > 0 && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Case 3: Left side is sorted, so pivot is in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
