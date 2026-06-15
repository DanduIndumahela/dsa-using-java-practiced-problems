package Strings;

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(isPalindrome(str)); // Output: true
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Fix 1

        if (str.length() == 0) {
            return true;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i); // Fix 2
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
