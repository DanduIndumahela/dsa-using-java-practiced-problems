public class Countofrotate {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 1, 2, 3};
        System.out.println(countofrotate(arr)); // Output: 3
    }

    static int countofrotate(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;  // rotation count = pivot + 1
    }

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 👉 Check if mid is pivot (greater than next)
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // 👉 Check if mid-1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // 👉 Decide which side to go
            if (arr[mid] >= arr[start]) {
                // Pivot must be on right
                start = mid + 1;
            } else {
                // Pivot must be on left
                end = mid - 1;
            }
        }

        return -1; // If not found (array not rotated)
    }
}
