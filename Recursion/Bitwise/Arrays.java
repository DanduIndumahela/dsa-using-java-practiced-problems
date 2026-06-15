package Recursion.Bitwise;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 1, 1, 1, 5, 5, 5, 8, 8, 8, 3 };
        System.out.println(repeated(arr)); // Output: 3
    }

    static int repeated(int[] arr) {
        int result = 0;

        // Check each bit position
        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    sum++;
                }
            }

            // If bit sum is not divisible by 3, that bit belongs to the unique number
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
